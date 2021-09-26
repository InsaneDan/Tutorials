package hackerrank.Practice.Algorithms.ch053_Encryption;

import java.io.*;

class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
        // string without spaces
        s = s.replaceAll("\\s+", "").trim();
        int len = s.length();
        // detect table/matrix
        int rows = (int) Math.floor(Math.sqrt(len));
        int columns = (int) Math.ceil(Math.sqrt(len));
        // check fields amount
        if (rows * columns < len) rows++;
        // fill-in matrix
        char[][] table = new char[rows][columns];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (counter == len) break;
                table[i][j] = s.charAt(counter++);
            }
        }
        // read matrix
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (table[i][j] != 0) sb = sb.append(table[i][j]);
            }
            sb = sb.append(" ");
        }
        return sb.toString();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Sample Input
haveaniceday
Sample Output 0
hae and via ecy

Sample Input 1
feedthedog
Sample Output 1
fto ehg ee dd

Sample Input 2
chillout
Sample Output 2
clu hlt io

 */

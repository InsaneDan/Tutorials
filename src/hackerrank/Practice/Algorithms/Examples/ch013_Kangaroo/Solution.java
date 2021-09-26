package hackerrank.Practice.Algorithms.ch013_Kangaroo;

import java.io.*;

class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        // v1-v2 != 0 // avoid further RuntimeException - division 0
        // (x2-x1) / (v1-v2) >= 1 - kangaroos getting closer to each other
        // (x2-x1) % (v1-v2) == 0 - they'll reach the point after integer amount of jumps
        if (v1-v2 != 0 && (x2-x1) / (v1-v2) >= 1 && (x2-x1) % (v1-v2) == 0) return "YES";
        return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        System.out.println(result);
        bufferedReader.close();
//        bufferedWriter.close();
    }
}

/*
Sample Input 0
0 3 4 2
Sample Output 0
YES

Sample Input 1
0 2 5 3
Sample Output 1
NO

Input (stdin)
21 6 47 3
Expected Output
NO

Input (stdin)
43 2 70 2
Expected Output
NO

*/
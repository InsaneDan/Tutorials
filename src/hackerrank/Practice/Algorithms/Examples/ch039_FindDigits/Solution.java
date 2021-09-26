package hackerrank.Practice.Algorithms.ch039_FindDigits;

import java.io.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        // Write your code here
        int counter = 0, val = n;
        if (n == 0) return 0;
        while (val > 0) {
            int digit = val % 10;
            if (digit != 0 && n % digit == 0) counter++;
            val /= 10;
        }
        return counter;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

                System.out.println(result);
//                bufferedWriter.write(String.valueOf(result));
//                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
//        bufferedWriter.close();
    }
}


/*
Input
2
12
1012
Expected Output
2
3

Input
11
123456789
114108089
110110015
121
33
44
55
66
77
88
106108048
Output
3
3
6
2
2
2
2
2
2
2
5
 */
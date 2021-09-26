package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day29
// Day 29: Bitwise AND
// https://www.hackerrank.com/challenges/30-bitwise-and/problem

import java.io.*;
import java.util.stream.*;

class Result {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int n, int k) {
        // Write your code here
        int finalResult = 0;
        for(int i = 1; i < n ; i++){
            for (int j = i + 1; j <= n ; j++){
                int tempResult = i & j;
                if(tempResult < k && tempResult > finalResult)
                    finalResult = tempResult;
            }
        }
        return finalResult;
    }
}

public class Day29 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); // output has been changed

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result.bitwiseAnd(count, lim);

                System.out.println(res);
//                bufferedWriter.write(res);
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
Sample Input

STDIN   Function
-----   --------
3       T = 3
5 2     N = 5, K = 2
8 5     N = 8, K = 5
2 2     N = 8, K = 5

Sample Output

1
4
0

 */
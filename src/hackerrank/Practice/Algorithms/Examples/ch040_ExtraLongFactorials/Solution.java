package hackerrank.Practice.Algorithms.ch040_ExtraLongFactorials;

import java.io.*;
import java.math.*;

class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    private static BigInteger res = BigInteger.ONE;

    public static void extraLongFactorials(int n) {
        // Write your code here

//        recursive variant
//        if (n > 1) {
//            extraLongFactorials(n - 1);
//            res = res.multiply(BigInteger.valueOf(n));
//        }

        while (n > 1) res = res.multiply(BigInteger.valueOf(n--));

        System.out.println(res);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}

/*
Sample Input
25
Sample Output
15511210043330985984000000

Sample Input
45
Sample Output
119622220865480194561963161495657715064383733760000000000
 */
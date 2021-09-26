package hackerrank.Practice.Algorithms.ch006_PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positives = 0;
        int negatives = 0;
        int zeroes = 0;
        for (Integer el : arr) {
            if (el > 0) positives++;
            if (el == 0) zeroes++;
            if (el < 0) negatives++;
        }
        System.out.printf("%6f\n", (double) positives/arr.size());
        System.out.printf("%6f\n", (double) negatives/arr.size());
        System.out.printf("%6f\n", (double) zeroes/arr.size());
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

/*
Constraints
0 < n ≤ 100
-100 ≤ arr[i] ≤ 100

Sample Input
STDIN           Function
-----           --------
6               arr[] size n = 6
-4 3 -9 0 4 1   arr = [-4, 3, -9, 0, 4, 1]

Sample Output
0.500000
0.333333
0.166667
*/
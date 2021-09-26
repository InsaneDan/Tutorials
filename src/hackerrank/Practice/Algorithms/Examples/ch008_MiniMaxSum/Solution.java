package hackerrank.Practice.Algorithms.ch008_MiniMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = 0;
        long sum = 0L;
        for (Integer el : arr) {
            if (el>max) max = el;
            if (el<min) min = el;
            sum += el;
        }
        System.out.println(String.valueOf(sum-max)
                .concat(" ")
                .concat(String.valueOf(sum-min)));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

/*
Constraints
1 ≤ arr[i] ≤ 10^9
arr: an array of 5 integers

Sample Input
1 2 3 4 5

Sample Output
10 14
*/
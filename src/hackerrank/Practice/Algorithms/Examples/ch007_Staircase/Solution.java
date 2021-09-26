package hackerrank.Practice.Algorithms.ch007_Staircase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
//            System.out.println(" ".repeat(n-i).concat("#".repeat(i))); // Java 11
            System.out.printf(String.join("", Collections.nCopies(n-i, " ")));
            System.out.println(String.join("", Collections.nCopies(i, "#"))); // Java 8
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}

/*
Constraints
0 < n ≤ 100

Sample Input
6

Sample Output
     #
    ##
   ###
  ####
 #####
######

*/
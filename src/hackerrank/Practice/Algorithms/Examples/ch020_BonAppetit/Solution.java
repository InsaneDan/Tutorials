package hackerrank.Practice.Algorithms.ch020_BonAppetit;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill - an array of integers representing the cost of each item ordered
     *  2. INTEGER k - an integer representing the zero-based index of the item Anna doesn't eat
     *  3. INTEGER b - the amount of money that Anna contributed to the bill
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int shared = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k)) / 2;
        if (b == shared) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - shared);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        Result.bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}

/*
Sample Input 0
4 1
3 10 2 9
12
Sample Output 0
5

Sample Input 1
4 1
3 10 2 9
7
Sample Output 1
Bon Appetit
 */
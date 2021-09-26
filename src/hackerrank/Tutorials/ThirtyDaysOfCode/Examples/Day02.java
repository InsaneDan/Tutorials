package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day02
// Day 2: Operators
// https://www.hackerrank.com/challenges/30-operators/problem

import java.io.*;

class Result29 {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        int res = (int) Math.round(meal_cost * (100 + tip_percent + tax_percent) / 100);
        System.out.println(res);
    }

}

public class Day02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result29.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();
    }
}

/*
Sample Input
12.00
20
8

Sample Output
15
 */
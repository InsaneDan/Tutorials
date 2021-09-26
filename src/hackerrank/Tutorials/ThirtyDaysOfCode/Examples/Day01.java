package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day01
// Day 1: Data Types
// https://www.hackerrank.com/challenges/30-data-types/problem

import java.util.*;

public class Day01 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        s2 = scan.nextLine(); // reading EOL after double value
        s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + s2);
        scan.close();
    }
}

/*
Note! Double format 4,0!!! not 4.0 (localized num format)

Sample Input
12
4,0
is the best place to learn and practice coding!

Sample Output
16
8.0
HackerRank is the best place to learn and practice coding!
*/
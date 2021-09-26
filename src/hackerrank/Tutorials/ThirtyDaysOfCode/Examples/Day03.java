package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day03
// Day 3: Intro to Conditional Statements
// https://www.hackerrank.com/challenges/30-conditional-statements/problem

import java.io.*;

public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <=5) {
                System.out.println("Not Weird") ;
            } else if (N >= 6 && N <=20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}

/*

Sample Input 0
3

Sample Output 0
Weird

Sample Input 1
24
Sample Output 1
Not Weird

 */
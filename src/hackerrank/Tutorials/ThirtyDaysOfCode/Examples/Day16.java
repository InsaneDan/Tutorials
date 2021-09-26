package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day16
// Day 16: Exceptions - String to Integer
// https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem


import java.io.*;

public class Day16 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        bufferedReader.close();

        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}

/*
Sample Input 0

3

Sample Output 0

3

Sample Input 1

za

Sample Output 1

Bad String

 */
package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day10
// Day 10: Binary Numbers
// https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String binaryString = "";
        while (n>0) {
            binaryString = n % 2 + binaryString;
            n /= 2;
        }
        int substringLength = 0;
        String substringsArray[] = binaryString.split("0");
        for (String substring : substringsArray) {
            if (substringLength < substring.length()) substringLength = substring.length();
        }
        System.out.println(substringLength);
    }
}

/*
Sample Input 1

5

Sample Output 1

1

Sample Input 2

13

Sample Output 2

2

 */
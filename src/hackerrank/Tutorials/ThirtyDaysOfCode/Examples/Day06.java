package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day06
// Day 6: Let's Review
// https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;

public class Day06 {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine().trim());
        for (int i=0; i<n; i++) {
            String s = br.readLine().trim();
            String odd = "";
            String even = "";
            for (int j=0; j<s.length(); j++) {
                if (j%2 == 0) {
                    even = even + s.substring(j, j+1);
                } else {
                    odd = odd + s.substring(j, j+1);
                }
            }
            System.out.println(even + " " + odd);
        }
        br.close();
    }
}

/*
Sample Input

2
Hacker
Rank

Sample Output

Hce akr
Rn ak

 */
package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day25
// Day 25: Running Time and Complexity
// https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        boolean prime;
        while(n-- > 0) {
            int num = sc.nextInt();
            prime = true;
            if (num < 2) {
                prime = false;
            } else {
                for (int i = 2; i <= (int) Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }
            System.out.println(prime ? "Prime" : "Not prime");
        }
    }
}

/*

Sample Input

3
12
5
7

Sample Output

Not prime
Prime
Prime

 */
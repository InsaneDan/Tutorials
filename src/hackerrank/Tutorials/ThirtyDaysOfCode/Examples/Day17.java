package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day17
// Day 17: More Exceptions
// https://www.hackerrank.com/challenges/30-more-exceptions/problem

import java.util.*;

//Write your code here
class Calculator{
    public int power(int n, int p) throws Exception {
        int res = 0;
        if (n>=0 && p>=0) {
            res = (int) Math.pow(n, p);
        } else {
            throw new Exception("n and p should be non-negative");
        }
        return res;
    }

}

public class Day17 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}

/*
Sample Input

4
3 5
2 4
-1 -2
-1 3

Sample Output

243
16
n and p should be non-negative
n and p should be non-negative

 */
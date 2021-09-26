package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day19, Calculator to Calculator19
// Day 19: Interfaces
// https://www.hackerrank.com/challenges/30-interfaces/problem

import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator19 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (n%i == 0) res += i;
        }
        return res + n;
    }
}

public class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator19();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}

/*
Sample Input

6

Sample Output

I implemented: AdvancedArithmetic
12

 */
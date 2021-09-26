package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day14
// Day 14: Scope
// https://www.hackerrank.com/challenges/30-scope/problem

import java.util.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        int max = elements[0];
        int min = elements[0];
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] < min) min = elements[i];
            if (elements[i] > max) max = elements[i];
        }
        maximumDifference = max-min;
    }

} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
/*
Sample Input

STDIN   Function
-----   --------
3       __elements[] size N = 3
1 2 5   __elements = [1, 2, 5]

Sample Output

4

 */
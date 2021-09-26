package hackerrank.Practice.Algorithms.ch001_SolveMeFirst;

import java.util.*;

public class Solution {


    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

/*

Ограничения
1 ≤ A, B ≤ 1000

Пример входных данных
2
3

Пример выходных данных
5

 */
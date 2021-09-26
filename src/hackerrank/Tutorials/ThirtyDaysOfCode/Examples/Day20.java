package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day20
// Day 20: Sorting
// https://www.hackerrank.com/challenges/30-sorting/problem

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day20 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        // Write your code here
        int countLocal;
        int countTotal = 0;
        do {
            countLocal = 0;
            for (int i = 0; i < a.size()-1; i++) {
                if (a.get(i) > a.get(i+1)) {
                    int tmp = a.get(i+1);
                    a.set(i+1, a.get(i));
                    a.set(i, tmp);
                    countLocal++;
                }
            }
            countTotal += countLocal;
        } while (countLocal != 0);

        System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d\n", countTotal, a.get(0), a.get(a.size()-1));

        bufferedReader.close();
    }
}

/*
Sample Input 0

3
1 2 3

Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3

Sample Input 1

3
3 2 1

Sample Output 1

Array is sorted in 3 swaps.
First Element: 1
Last Element: 3

 */
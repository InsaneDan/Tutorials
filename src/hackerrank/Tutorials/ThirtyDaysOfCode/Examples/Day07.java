package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day07
// Day 7: Arrays
// https://www.hackerrank.com/challenges/30-arrays/problem

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Day07 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }

    }
}

/*
Sample Input

4
1 4 3 2

Sample Output

2 3 4 1

 */
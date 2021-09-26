package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day26
// Day 26: Nested Logic
// https://www.hackerrank.com/challenges/30-nested-logic/problem

import java.time.LocalDate;
import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();

        int dayDue = scanner.nextInt();
        int monthDue = scanner.nextInt();
        int yearDue = scanner.nextInt();

        LocalDate dateReturned = LocalDate.of(yearReturned, monthReturned, dayReturned);
        LocalDate dateDue = LocalDate.of(yearDue, monthDue, dayDue);

        int res = 0;
        if (!dateReturned.isAfter(dateDue)) {
            // do nothing...
        } else if (yearReturned > yearDue) {
            res = 10000; //fixed fine of 10000
        } else if (monthReturned > monthDue) {
            res += (monthReturned - monthDue) * 500;
        } else if (dayReturned > dayDue) {
            res += (dayReturned - dayDue) * 15;
        }

        System.out.println(res);
    }
}

/*

Sample Input

STDIN       Function
-----       --------
9 6 2015    day = 9, month = 6, year = 2015 (date returned)
6 6 2015    day = 6, month = 6, year = 2015 (date due)

Sample Output

45

Input (stdin)
31 8 2004
20 1 2004
Expected Output
3500

Input (stdin)
8 4 12
1 1 1
Expected Output
10000

Input (stdin)
23 12 1234
19 9 2468
Expected Output
0

 */
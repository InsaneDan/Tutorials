package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day18
// Day 18: Queues and Stacks
// https://www.hackerrank.com/challenges/30-queues-stacks/problem

import java.util.*;

public class Day18 {
    // Write your code here.
    private Queue<Character> queue = new LinkedList<>();
    private Stack<Character> stack = new Stack<>();

    private char dequeueCharacter() {
        return queue.poll();
    }

    private char popCharacter() {
        return stack.pop();
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private void pushCharacter(char c) {
        stack.push(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        // Solution p = new Solution(); // class name needs to be renamed
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
/*
Sample Input

racecar

Sample Output

The word, racecar, is a palindrome.

 */
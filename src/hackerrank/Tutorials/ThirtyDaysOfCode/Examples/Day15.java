package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day15
// Day 15: Linked List
// https://www.hackerrank.com/challenges/30-linked-list/problem

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15 {

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node node = new Node(data);
        if (head == null) {
            return node;
        } else if (head.next == null) {
            head.next = node;
        } else {
            insert(head.next, data);
        }
        return head;
    }

//    // recursive solution
//    public static  Node insert(Node head,int data) {
//        //Complete this method
//        if (head == null) return new Node(data);
//        head.next = insert(head.next, data);
//        return head;
//    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

/*
Sample Input

STDIN   Function
-----   --------
4       T = 4
2       first data = 2
3
4
1       fourth data = 1

Sample Output

2 3 4 1

 */
package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day23, Node to Node23
// Day 23: BST Level-Order Traversal
// https://www.hackerrank.com/challenges/30-binary-trees/problem

import java.util.*;

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}

public class Day23 {

    static void levelOrder(Node23 root){
        //Write your code here
        Queue<Node23> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node23 node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node23 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}

/*

Sample Input

6
3
5
4
7
2
1

Sample Output

3 2 5 1 4 7

 */
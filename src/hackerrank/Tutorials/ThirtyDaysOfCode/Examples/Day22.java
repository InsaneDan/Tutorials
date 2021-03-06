package hackerrank.Tutorials.ThirtyDaysOfCode.Examples;
// public class Solution renamed to Day22, Node to Node22
// Day 22: Binary Search Trees
// https://www.hackerrank.com/challenges/30-binary-search-trees/problem

import java.util.*;

class Node22{
    Node22 left,right;
    int data;
    Node22(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day22 {

    public static int getHeight(Node22 root){
        //Write your code here
        if (root != null) {
            return 1 + (Math.max(getHeight(root.left), getHeight(root.right)));
        }
        return -1;
    }

    public static Node22 insert(Node22 root,int data){
        if(root==null){
            return new Node22(data);
        }
        else{
            Node22 cur;
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
        Node22 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}

/*
Sample Input

7
3
5
2
1
4
6
7

Sample Output

3

 */
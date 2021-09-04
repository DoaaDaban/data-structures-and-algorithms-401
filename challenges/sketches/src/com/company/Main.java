package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
// {1,2,3}3
//{1,2,3,1,2,3}6

public class Main {
    public static boolean isUnique(String sentence){
        HashSet<Character> unique = new HashSet<>();
        sentence = sentence.replace(" " , "");
        for (int i = 0; i < sentence.length(); i++) {
            if (unique.add(sentence.charAt(i))){
                continue;
            }
            return false;
        }
        return true;
    }
    static class Node
    {
        int data;
        Node left = null, right = null;

        Node(int data) {
            this.data = data;
        }
    }
    public static boolean isSymmetric(Node X, Node Y)
    {
        if (X == null && Y == null) {
            return true;
        }
        return (X != null && Y != null) &&
                isSymmetric(X.left, Y.right) &&
                isSymmetric(X.right, Y.left);
    }
    public static boolean isSameTree(Node p, Node q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.data != q.data) return false;
        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        Node first = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
//        System.out.println(isSymmetric(root.left , root.right));
//        System.out.println(isSameTree(root , first));
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i > j )
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >=n - i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        int[] arr ={10 , 4  , 6 ,3, 5};
//        int max = 0;
//        String maxNums = "";
//        for (int i = arr.length -1; i >= 0 ; i--) {
//            if(arr[i] > max) {
//                max = arr[i];
//                maxNums += max;
//            }
//        }
//        System.out.println(maxNums);
//        System.out.println(isUnique("helo"));
    }
}

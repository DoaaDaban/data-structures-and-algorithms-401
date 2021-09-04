package com.mohiesen.tree;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public  boolean compareTree(BinaryTree tree , BinaryTree tree2) {
        int firstTreeCount = countLeaves(tree.root);
        System.out.println(firstTreeCount);
        count = 0;
        int secondTreeCount = countLeaves(tree2.root);
        System.out.println(secondTreeCount);

        return firstTreeCount == secondTreeCount;
    }


    public  int count = 0;
    public  int countLeaves(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null){
                count++;
            }
            countLeaves(node.left);
            countLeaves(node.right);
        }
        return count;
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

    public static boolean isSym(Node p, Node q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;

        return isSym(p.right, q.left) &&
                isSym(p.left, q.right);
    }

    public static void main(String[] args) {
	    BinaryTree<Integer> binaryTree = new BinaryTree<>();
	    binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(3);
        binaryTree.root.right = new Node<>(2);
        binaryTree.root.left.left = new Node<>(5);
        binaryTree.root.left.right = new Node<>(5);
        System.out.println(binaryTree.DFSPreOrder(binaryTree.root));
//        List<Integer> binaryData = binaryTree.DFSPreOrder(binaryTree.root);
//        System.out.println(binaryData);
//        Set<Integer> set = new HashSet<>();
//        set.addAll(binaryData);
//        System.out.println(set.size() == binaryData.size());
//
        BinaryTree<Integer> binaryTree2 = new BinaryTree<>();
        binaryTree2.root = new Node<>(1);
        binaryTree2.root.left = new Node<>(3);
        binaryTree2.root.right = new Node<>(2);
        binaryTree2.root.left.left = new Node<>(4);
        binaryTree2.root.left.right = new Node<>(5);
        System.out.println(isSameTree(binaryTree.root , binaryTree2.root));
//        System.out.println(compareTree(binaryTree , binaryTree2));
//        binaryTree.root.left.right.right = new Node<>(10);
//        System.out.println(binaryTree.max());
//        System.out.println(binaryTree.DFSInOrder(binaryTree.root));
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.root = new Node<>(15);
//        binarySearchTree.Add(12);
//        binarySearchTree.Add(16);
//        System.out.println(binarySearchTree.contains(12));
// Divide and conquer nlogn
//        int arr[] = {1 , 2 , 5 , 7 ,18};
//        int max = 0 ;
//        int counter  = 1 ;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("from inner loop " + counter++);
//            }
//        }
//
//        System.out.println("array size is " + arr.length);
    }



}

package com.mohiesen.tree;

public class Main {

    public static void main(String[] args) {
	    BinaryTree<Integer> binaryTree = new BinaryTree<>();
	    binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);
        binaryTree.root.left.right.right = new Node<>(10);
        System.out.println(binaryTree.max());
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.root = new Node<>(15);
//        binarySearchTree.Add(12);
//        binarySearchTree.Add(16);
//        System.out.println(binarySearchTree.contains(12));
    }

}

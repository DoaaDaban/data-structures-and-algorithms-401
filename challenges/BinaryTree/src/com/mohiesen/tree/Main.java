package com.mohiesen.tree;

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
    public static void main(String[] args) {
	    BinaryTree<Integer> binaryTree = new BinaryTree<>();
	    binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(3);
        binaryTree.root.right = new Node<>(2);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        BinaryTree<Integer> binaryTree2 = new BinaryTree<>();
//        binaryTree2.root = new Node<>(1);
//        binaryTree2.root.left = new Node<>(3);
//        binaryTree2.root.right = new Node<>(2);
//        binaryTree2.root.left.left = new Node<>(4);
//        binaryTree2.root.left.right = new Node<>(5);

//        System.out.println(compareTree(binaryTree , binaryTree2));
//        binaryTree.root.left.right.right = new Node<>(10);
//        System.out.println(binaryTree.max());
//        System.out.println(binaryTree.DFSInOrder(binaryTree.root));
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.root = new Node<>(15);
//        binarySearchTree.Add(12);
//        binarySearchTree.Add(16);
//        System.out.println(binarySearchTree.contains(12));
    }

}

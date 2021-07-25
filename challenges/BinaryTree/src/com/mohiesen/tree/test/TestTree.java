package com.mohiesen.tree.test;
import com.mohiesen.tree.BinarySearchTree;
import com.mohiesen.tree.BinaryTree;
import com.mohiesen.tree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTree {
BinaryTree<Integer> binaryTree;
BinarySearchTree binarySearchTree;


//Can successfully instantiate an empty tree
    @BeforeEach
    public void testInit(){
        binarySearchTree = new BinarySearchTree();
        binaryTree = new BinaryTree<>();
    }

 //Can successfully instantiate a tree with a single root node
    @Test
    public void testOneRoot () {
        binaryTree.root = new Node<>(15);
        Assertions.assertEquals(15 , binaryTree.root);
    }

 //Can successfully add a left child and right child to a single root node
    @Test
    public void testLeftAndRightChild() {
        Node<Integer> node1 = new Node<>(15);
        Node<Integer> node2 = new Node<>(20);
        binaryTree.root = new Node<>(10);
        binaryTree.root.right = node2;
        binaryTree.root.left = node1;
        Assertions.assertEquals(15 , binaryTree.root.left.data);
        Assertions.assertEquals(20 , binaryTree.root.right.data);
    }

    //        Can successfully return a collection from a preorder traversal
//        Can successfully return a collection from an inorder traversal
//        Can successfully return a collection from a postorder traversal

    @Test
    public void testTraverseReturning() {
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        Assertions.assertEquals(5 , binaryTree.DFSInOrder(binaryTree.root).size());
        Assertions.assertEquals(10 , binaryTree.DFSPostOrder(binaryTree.root).size());
        Assertions.assertEquals(15 , binaryTree.DFSPreOrder(binaryTree.root).size());
    }
}

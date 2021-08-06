package com.mohiesen.tree.test;
import com.mohiesen.tree.BinarySearchTree;
import com.mohiesen.tree.BinaryTree;
import com.mohiesen.tree.Main;
import com.mohiesen.tree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTree {
BinaryTree<Integer> binaryTree;
BinarySearchTree binarySearchTree;
Main myMain;


//Can successfully instantiate an empty tree
    @BeforeEach
    public void testInit(){
        binarySearchTree = new BinarySearchTree();
        binaryTree = new BinaryTree<>();
        myMain = new Main();
    }

 //Can successfully instantiate a tree with a single root node
    @Test
    public void testOneRoot () {
        binaryTree.root = new Node<>(15);
        Assertions.assertEquals(15 , binaryTree.root.data);
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

    // Test max method
    @Test
    public void testMax() {
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        Assertions.assertEquals(5 , binaryTree.max());
    }

//    Test for empty tree
    @Test
    public void testMaxEmptyTree() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            binaryTree.max();
        });
    }

    /*
    Test to BFS Empty Tree
     */

    @Test
    public void testBFSEmptyTree() {
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);
        Assertions.assertEquals(5 , binaryTree.breadth(binaryTree).size(), "Returns the numbers of elements in the returned list for traversing a tree");
    }


        /*
    Test to BFS Empty Tree
     */

    @Test
    public void testBFSTree() {

        Assertions.assertNull(binaryTree.breadth(binaryTree) , "Returns null for traversing an empty tree");
    }

    /*
        Test Two full trees
     */

    @Test
    public void testTwoFullTrees(){
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree2.root = new Node<>(1);
        binaryTree2.root.left = new Node<>(2);
        binaryTree2.root.right = new Node<>(3);
        binaryTree2.root.left.left = new Node<>(4);
        binaryTree2.root.left.right = new Node<>(5);

        Assertions.assertTrue(myMain.compareTree(binaryTree2 , binaryTree));
    }

    /*
    Test Unequal two trees
     */

    @Test
    public void testNonEqualTwoTrees() {
        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        BinaryTree binaryTree2 = new BinaryTree();

        binaryTree2.root = new Node<>(1);
        binaryTree2.root.left = new Node<>(2);
        binaryTree2.root.right = new Node<>(3);


        Assertions.assertFalse(myMain.compareTree(binaryTree , binaryTree2));
    }

    /*
    Test comparing Empty tree
     */

    @Test
    public void testEmptyTree()
    {        binaryTree.root = new Node<>(1);
        binaryTree.root.left = new Node<>(2);
        binaryTree.root.right = new Node<>(3);
        binaryTree.root.left.left = new Node<>(4);
        binaryTree.root.left.right = new Node<>(5);

        BinaryTree binaryTree2 = new BinaryTree();

        Assertions.assertFalse(myMain.compareTree(binaryTree2 , binaryTree));
    }

    /*
    Test comparing two empty trees
     */

    @Test
    public void testTwoEmptyTrees() {
        BinaryTree binaryTree2 = new BinaryTree();

        Assertions.assertTrue(myMain.compareTree(binaryTree , binaryTree2));
    }
}


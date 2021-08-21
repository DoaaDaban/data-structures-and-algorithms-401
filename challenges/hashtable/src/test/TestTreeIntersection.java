package test;

import com.mohiesen.BinaryTree.BinaryTree;
import com.mohiesen.BinaryTree.Node;
import com.mohiesen.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestTreeIntersection {
    Main main;
    BinaryTree<Integer> myTree1;
    BinaryTree<Integer> myTree2;
    BinaryTree<Integer> myTree3;
    BinaryTree<Integer> myTree4;
    BinaryTree<Integer> myTree5;
    BinaryTree<Integer> myTree6;

    @BeforeEach
    public void init(){
        main = new Main();
        myTree1 = new BinaryTree<>();
        myTree2 = new BinaryTree<>();
        myTree1.root = new Node<Integer>(10);
        myTree1.root.left = new Node<>(20);
        myTree1.root.right = new Node<>(25);
        myTree1.root.right.right = new Node<>(40);
        myTree1.root.right.left = new Node<>(50);


        myTree2.root = new Node<Integer>(15);
        myTree2.root.left = new Node<>(20);
        myTree2.root.right = new Node<>(25);
        myTree2.root.right.right = new Node<>(40);
        myTree2.root.right.left = new Node<>(55);
    }

    /*
    Test The happy path
     */
    @Test
    public void testHappyPath(){
        Integer[] arr = main.treeIntersection(myTree1 , myTree2);
        Integer[] expectedArray = {20,25,40};
        Assertions.assertTrue(Arrays.equals(expectedArray , arr));
    }

    /*
    Test no Intersection
     */
    @Test
    public void testNoIntersection(){
        myTree3 = new BinaryTree<>();
        myTree4 = new BinaryTree<>();
        myTree3.root = new Node<Integer>(10);
        myTree3.root.left = new Node<>(17);


        myTree4.root = new Node<Integer>(15);
        myTree4.root.left = new Node<>(20);

        Assertions.assertEquals(0 , main.treeIntersection(myTree3 , myTree4).length);
    }

    /*
    Test for empty trees
     */
    @Test
    public void testEmptyIntersection(){
        myTree5 = new BinaryTree<>();
        myTree6 = new BinaryTree<>();
        Assertions.assertThrows( NullPointerException.class , () -> {main.treeIntersection(myTree5 , myTree6);});
    }
}

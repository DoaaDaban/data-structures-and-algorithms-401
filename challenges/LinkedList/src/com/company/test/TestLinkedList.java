package com.company.test;

import com.company.main.LinkedList;
import com.company.main.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinkedList {
    LinkedList<Integer> testList;
    LinkedList<Integer> testList2;
    Main<Integer> main;
    @BeforeEach
    public void init() {
        testList = new LinkedList<>();
        testList2 = new LinkedList<>();
        main = new Main<>();
    }

    @Test
    public void testEmpty() {
        Assertions.assertTrue( testList.length >= 0 ,"Return true if linked list is initialized and have length");
    }

    @Test
    public void testAdding() {
        testList.append(15);
        Assertions.assertEquals(1, testList.length, "Return true if linked list is initialized and have length");

    }

    @Test
    public void testHead() {
        testList.append(12);
        testList.append(13);
        testList.append(15);
        testList.insertBefore(13 , 15);
        Assertions.assertEquals(12 , testList.head.data , "Checks if the head is equal to the actual head element.");
        Assertions.assertTrue(testList.length == 4 , "Return true if multiple elements added.");
        Assertions.assertTrue(testList.includes(15) , "Return true if it finds the test element");
        Assertions.assertFalse(testList.includes(19) , "Return false when not finding a specific element");
        Assertions.assertEquals("{ 12 -> 15 -> 13 -> 15 -> null }" , String.valueOf(testList));
    }


    @Test
    public void testInsert() {
        testList.insert(15);
        testList.insert(150);
//        testList.insertAfter(15 , 16); unComment to test both before and after , comment to test if you can add before the first element .
//        testList.insertBefore(15 , 16);
        Assertions.assertEquals(2 , testList.length);

    }

    @Test
    public void testKthFromEnd() {
        testList.append(10);
        testList.append(20);
        testList.append(30);
        testList.append(40);
        testList.append(50);
        testList.append(60);
        testList.append(70);

        /**
         * kth arg greater than the end
         */
            Assertions.assertNull(testList.kthFromEnd(9) , "Returns null if the index is greater than the end ");
        /**
         * kth arg equals the length
         */
        Assertions.assertNull( testList.kthFromEnd(7) ,"Return null if the index equals null");
        /**
         * kth arg is negative
         */
        Assertions.assertNull( testList.kthFromEnd(-7) ,"Return null if the index equals a negative number");

        /**
         * kth arg in the middle of linked list
         */
        Assertions.assertEquals(40 , testList.kthFromEnd(3) , "returns true if the method returns the value in the 3rd index from the end ");

        /**
         * kth on linked list of size 1
         */

        testList.clear();
        testList.append(1);
        Assertions.assertEquals(1 , testList.length , "return true if the size is 1 ");
        Assertions.assertEquals(1 , testList.kthFromEnd(0) , "Return true if it finds the only element in the list ");

    }

    @Test
    public void testZipList() {
        testList.append(1);
        testList.append(1);
        testList.append(1);
        testList2.append(2);
        testList2.append(2);
        testList2.append(2);
        testList2.append(2);

        Assertions.assertEquals(7, main.zipLists(testList, testList2).length, "Return true if merges two linked lists ");
    }
}

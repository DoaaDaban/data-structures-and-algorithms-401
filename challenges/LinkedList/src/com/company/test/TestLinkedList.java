package com.company.test;

import com.company.main.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinkedList {
    LinkedList<Integer> testList;
    @BeforeEach
    public void init() {
        testList = new LinkedList<>();
    }

    @Test
    public void testEmpty() {
        Assertions.assertTrue( testList.length >= 0 ,"Return true if linked list is initialized and have length");
    }

    @Test
    public void testAdding() {
        testList.append(15);
        Assertions.assertTrue( testList.length == 1 ,"Return true if linked list is initialized and have length");

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
}

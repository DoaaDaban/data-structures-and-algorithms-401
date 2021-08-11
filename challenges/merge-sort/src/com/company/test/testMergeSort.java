package com.company.test;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testMergeSort {
    Main main;
    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
    public void testExpected() {
        int arr[] = {15, 2, 6, 3, 1};
        main.mergeSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] <= arr[i + 1], "Returns true if sorted");
        }
    }

    @Test
    public void testSorted() {
        int arr[] = {15, 22, 66, 73, 100};
        main.mergeSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] <= arr[i + 1], "Returns true if sorted");
        }
    }

    @Test
    public void testEmpty() {
        int arr[] = {};
        main.mergeSort(arr);
        Assertions.assertTrue(arr.length == 0 , "returns an empty array");
    }
}

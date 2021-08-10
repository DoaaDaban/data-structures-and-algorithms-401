package test;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class testInsertionSort {
    Main main;

    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
    public void testExpected() {
        int arr[] = {15, 2, 6, 3, 1};
        main.insertionSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            Assertions.assertTrue(arr[i] <= arr[i + 1], "Returns true if sorted");
        }
    }

    @Test
    public void expectedFailure() {
        String[] arr = {"dad" , "adad" , "adfaf"};
//        Cant apply sort to non integer array
    }
}
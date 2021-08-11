package com.company;

public class Main {
    public void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int j = i-1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,15,3,1,5,6,7,15};
        Main main = new Main();
        main.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

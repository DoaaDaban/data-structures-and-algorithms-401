package com.mohiesen;
import java.util.ArrayList;

public class Main {
    public static boolean isPrime(int num){
        if(num > 2 && num >=0) {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if(num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 3;
        int[] myArr = {1 , 2 , 3};
//        {1,2,3,1,2,3}
        int[] mySecondArr = new int[n*2];
        for (int i = 0; i < myArr.length; i++) {
            mySecondArr[i] = myArr[i];
            mySecondArr[i + myArr.length] = myArr[i];
        }

//        try{
//            System.out.println("maryam");
//            throw new NullPointerException();
//        }
//        catch (NullPointerException e){
//            System.out.println(e.toString());
//        }
//
//        finally {
//            System.out.println("Hello");
//        }
        try {
            System.out.println(5 / 0);
        }
        catch (ArithmeticException a){
            System.out.println("Divide by zero");
        }

        System.out.println("Jaradat");

    }
}


/*
In package moh1 I have class a and class b
In package moh2 Class c
In class a I have method f1
Class c extends class a
and b extends class a
protected to package
 */

/*

 */

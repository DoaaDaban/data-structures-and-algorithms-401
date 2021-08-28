package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static boolean isUnique(String sentence){
        HashSet<Character> unique = new HashSet<>();
        sentence = sentence.replace(" " , "");
        for (int i = 0; i < sentence.length(); i++) {
            if (unique.add(sentence.charAt(i))){
                continue;
            }
            return false;
        }
        return true;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= 5; j++) {
//                if (i > j )
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }
//
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >=n - i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        System.out.println(isUnique("helo"));
    }
}

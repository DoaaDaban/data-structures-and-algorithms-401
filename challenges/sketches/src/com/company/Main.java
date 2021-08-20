package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

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
        HashSet<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        myString = myString.replace(" " , "");
        for (int i = 0; i < myString.length(); i++) {
            unique.add(myString.charAt(i));
        }

        System.out.println(unique.size() != myString.length());
    }
}

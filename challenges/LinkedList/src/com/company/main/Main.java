package com.company.main;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> ll = new LinkedList<>();
//        ll.insert(2);
//        ll.insert(4);
//        ll.insert(5);
//        ll.insert(15);
//        ll.append(12);
//        ll.append(12);
//        ll.append(12);
//        ll.insertAfter(4 , 9);
//        ll.insertBefore(12 , 5);
//        System.out.println(ll);
//        System.out.println(ll.includes(2));
//        System.out.println(ll.head.data);
//        ll.append(11);
//        ll.append(20);
//        ll.append(30);
//        ll.append(40);
//        ll.append(50);
//        ll.append(60);
        ll.insertBefore(10,10);
        ll.insertBefore(10,11);
        ll.insertBefore(12,11);
        System.out.println(ll.length);
        System.out.println(ll.kthFromEnd(0));
        System.out.println(ll.kthFromEnd(1));
        System.out.println(ll.kthFromEnd(2));
        System.out.println();
        System.out.println("");
    }
}

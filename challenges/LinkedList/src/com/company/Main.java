package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList<Integer> ll = new LinkedList<>();
        ll.insert(2);
        ll.insert(4);
        ll.insert(5);
        ll.insert(15);
        ll.append(12);
        ll.append(12);
        ll.append(12);
        ll.insertAfter(4 , 9);
        ll.insertBefore(12 , 5);
        System.out.println(ll);
        System.out.println(ll.includes(2));
    }
}

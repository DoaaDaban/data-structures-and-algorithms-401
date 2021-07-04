package com.company.main;

public class Node<T> {
    public Node next;
    public T data;

    public Node( T data) {
        this.data = data;
        this.next = null;
    }


}

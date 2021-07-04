package com.company;

public class Node<T> {
    public Node next;
    public T data;

    public Node( T data) {
        this.data = data;
        this.next = null;
    }


}

package com.company.main;

public class LinkedList <T>{
    public Node<T>  head;
    public int length;
    public LinkedList() {
        this.head = null;
    }

    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            head = newNode;
        }
        else {
        Node temp = head;
        head = newNode;
        head.next = temp;

        }
        length++;

    }
    public void insertAfter(T data ,T newData){
        Node<T> newNode = new Node<>(newData);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.data != data) {

                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
        length++;

    }
    public void insertBefore(T data , T newData){
        Node<T> newNode = new Node<>(newData);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.next.data != data) {
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;
        }
        length++;

    }
    public void append (T data) {
        Node<T> newNode = new Node<>(data);
        if(this.head == null) {
            head = newNode;
        }
        else {
            Node<T> trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
        }
        length++;

    }
    public boolean includes (T key) {
        Node<T> trav = head;
        while (trav != null) {
            if(trav.data.equals(key)){
                return true;
            }
            trav = trav.next;
        }
        return false;
    }

    public void clear() {
        this.head = null;
        length = 0;
    }
    @Override
    public String toString() {
        String list = "{ ";
        Node<T> trav = head;
        while (trav != null) {
            list += trav.data + " -> ";
            trav = trav.next;
        }
        if (trav == null) {
            list += trav + " }";
        }
        return list;
    }
}

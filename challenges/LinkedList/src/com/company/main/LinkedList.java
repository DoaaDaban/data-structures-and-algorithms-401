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
            Node<T> temp = head;
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
            while (trav.data != data && trav.next != null) {
                trav = trav.next;
            }
            if (trav.data == data) {
                newNode.next = trav.next;
                trav.next = newNode;
            }

            else {
                return;
            }

        }
        length++;

    }
    public void insertBefore(T data , T newData){
        Node<T> newNode = new Node<>(newData);

        if(this.head == null) {
            head = newNode;
            return;
        }
        else if (data == head.data) {
            newNode.next = head;
            head = newNode;
            return;
        }
        else {
            Node<T> trav = head;
            while (trav.next != null && trav.next.data != data) {
                trav = trav.next;
            }
            if (trav.next.data == data && trav.next != null){
                newNode.next = trav.next;
                trav.next = newNode;
            }
            else {
                return;
            }
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

    public T kthFromEnd(int k) {
        if(k >= this.length) {
            System.out.println("Index provided is greater than the elements count");
            return null;
        }

        else if (k < 0) {
            System.out.println("negative index doesn't exist");
            return null;
        }

        else {
            int tempCounter = this.length-1 ;
            Node<T> trav = head;
            while (tempCounter != k ){
                trav = trav.next;
                tempCounter--;
            }

            return trav.data;
        }
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
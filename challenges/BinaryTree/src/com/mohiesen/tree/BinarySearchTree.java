package com.mohiesen.tree;

public class BinarySearchTree extends BinaryTree<Integer>{
    public void Add(int data) {
        Node newnode = new Node(data);
        Node trav = root;


        Node y = null;

        while (trav != null) {
            y = trav;
            if (data < (int)trav.data)
                trav = trav.left;
            else
                trav = trav.right;
        }

        if (y == null)
            y = newnode;

        else if (data < (int)y.data)
            y.left = newnode;
        else
            y.right = newnode;

    }


    public boolean contains(int key) {
        Node<Integer> trav = root;

        while (trav != null) {
            if (trav.data == key) {
                return true;
            }
            if(key > trav.data) {
                trav = trav.right;

            }
            else {
                trav = trav.left;

            }

        }

        return false;
    }

}

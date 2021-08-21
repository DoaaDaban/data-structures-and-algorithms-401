package com.mohiesen.BinaryTree;

public class Node<G> {
    public G data;
    public Node<G> left;
    public Node<G> right;

    public Node(G data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

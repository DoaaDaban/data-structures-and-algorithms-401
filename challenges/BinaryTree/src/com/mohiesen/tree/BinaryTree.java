package com.mohiesen.tree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class BinaryTree<G> {
    public Node<G> root;
    List<G> content;

    public BinaryTree(G rootData) {
        this.root = new Node<>(rootData);
    }

    public BinaryTree(){
        this.root = null;
        this.content = new ArrayList<>();
    }

    public List<G> DFSInOrder(Node<G> node) {
        if(node != null){
            DFSInOrder(node.left);
            this.content.add(node.data);
            DFSInOrder(node.right);
        }
        return content;
    }

    public List<G> DFSPreOrder(Node<G> node) {
        if (node == null) { return null; }
        this.content.add(node.data);
        DFSPreOrder(node.left);
        DFSPreOrder(node.right);
        return content;
    }

    public List<G> DFSPostOrder(Node<G> node) {
        if(node != null){
            DFSInOrder(node.left);
            DFSInOrder(node.right);
            this.content.add(node.data);
        }
        return content;
    }

    public int max(){
        List<Integer> myList = (List<Integer>) this.DFSPreOrder(this.root);
        int max = Integer.MIN_VALUE;
        for (Integer integer : myList) {
            if (integer > max) {
                max = integer;
            }
        }

        return max;
    }
}

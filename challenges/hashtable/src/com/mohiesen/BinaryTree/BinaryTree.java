package com.mohiesen.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree<G> {
    public Node<Integer> root;
    List<G> content;

    public BinaryTree(G rootData) {
        this.root = (Node<Integer>) new Node<G>(rootData);
    }

    public BinaryTree() {
        this.root = null;
        this.content = new ArrayList<>();
    }
    private int count = 0 ;
    public List<G> DFSInOrder(Node<G> node) {
        if (node != null) {
            DFSInOrder(node.left);
            this.content.add(node.data);
            DFSInOrder(node.right);
        }
        return content;
    }

    public List<G> DFSPreOrder(Node<G> node) {
        if (node == null) {
            return null;
        }
        this.content.add(node.data);
        DFSPreOrder(node.left);
        DFSPreOrder(node.right);
        return content;
    }

    public List<G> DFSPostOrder(Node<G> node) {
        if (node != null) {
            DFSInOrder(node.left);
            DFSInOrder(node.right);
            this.content.add(node.data);
        }
        return content;
    }

    public int max() {
        List<Integer> myList = (List<Integer>) this.DFSPreOrder((Node<G>) this.root);
        int max = Integer.MIN_VALUE;
        for (Integer integer : myList) {
            if (integer > max) {
                max = integer;
            }
        }

        return max;
    }

    Queue<Node> queue = new LinkedList<Node>();
    List<G> list = new ArrayList<>();

    public List<G> breadth(BinaryTree tree) {
        if (root == null)
            return null;
        queue.clear();
        queue.add(root);
        list.add((G) root.data);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
                list.add((G) node.left.data);
            }
            if (node.right != null) {
                queue.add(node.right);
                list.add((G) node.right.data);
            }
        }
        return list;
    }

}

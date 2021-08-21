package com.mohiesen;

import com.mohiesen.BinaryTree.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public String firstRepeatedWord(String sentence){
        HashTable<String , Integer> dictionary = new HashTable<>();
        sentence = sentence.toLowerCase();
        String[] words = sentence.split("[\\p{Punct}\\s]+");
        for (String word : words){
            if( dictionary.contains(word))
                return word;
            else
                dictionary.add(word,1);
        }
        return null;
    }

    public Integer[] treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){
        HashTable<Integer , Integer> myHash = new HashTable<>();
        List<Integer> intersect = new ArrayList<>();
        for(int i : tree1.DFSPreOrder(tree1.root) ) {
            myHash.add(i , 0);
        }
        List<Integer> myList = tree2.DFSInOrder(tree2.root);
        for(int x : myList){
            System.out.println(x);
            if(myHash.contains(x)) {
                intersect.add(myList.get(myList.indexOf(x)));
            }
            else {
                myHash.add(myList.get(myList.indexOf(x)) , 0);
            }
        }
        return intersect.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
	    HashTable<String , Integer> myTable = new HashTable<>();
        myTable.add("Mohammed" , 31);
        myTable.add("Mohammed2" , 1);
        myTable.add("Mohammed22" , 1);
        myTable.add("Mohammed33" , 1);
        myTable.add("Mohammed13" , 1);
        myTable.add("Mohammed13da" , 1);
        myTable.add("Mohammed13dvv" , 1);
        myTable.add("Mohammed13czv" , 1);
        myTable.add("Mohammed13ad" , 1);
        myTable.add("Mohammed13e" , 1);
        System.out.println(myTable);
        System.out.println(myTable.contains("Mohammed13e"));
        String sen = "HELLO AFADG AFADG, SDFDAS HELLO";
        System.out.println(new Main().firstRepeatedWord(sen));
        BinaryTree<Integer> myTree1 = new BinaryTree<>();
        BinaryTree<Integer> myTree2 = new BinaryTree<>();

        myTree1.root = new Node<Integer>(10);
        myTree1.root.left = new Node<>(20);
        myTree1.root.right = new Node<>(25);
        myTree1.root.right.right = new Node<>(40);
        myTree1.root.right.left = new Node<>(50);


        myTree2.root = new Node<Integer>(15);
        myTree2.root.left = new Node<>(20);
        myTree2.root.right = new Node<>(25);
        myTree2.root.right.right = new Node<>(40);
        myTree2.root.right.left = new Node<>(55);
        new Main().treeIntersection(myTree1 , myTree2);
        Integer[] expectedArr = {20,25,40};

    }
}

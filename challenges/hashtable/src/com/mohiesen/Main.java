package com.mohiesen;

import com.mohiesen.BinaryTree.*;

import java.util.ArrayList;
import java.util.LinkedList;
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

    public List<List<String>> leftJoin(HashTable<String , String> table1 , HashTable<String , String> table2){
        List<List<String>> dictionary = new ArrayList<>();
        System.out.println(table1.getNumBuckets());
        for (int i = 0; i < table1.getNumBuckets(); i++) {
            List<String> data = new ArrayList<>();
            if(table1.getBucketArray().get(i) != null ){
                data.add(table1.getBucketArray().get(i).key);
                data.add(table1.getBucketArray().get(i).value);
                data.add(table2.get(data.get(0)));
                dictionary.add(data);

            }

        }
        return dictionary;
    }
    public static void main(String[] args) {
//	    HashTable<String , Integer> myTable = new HashTable<>();
//        myTable.add("Mohammed" , 31);
//        myTable.add("Mohammed2" , 1);
//        myTable.add("Mohammed22" , 1);
//        myTable.add("Mohammed33" , 1);
//        myTable.add("Mohammed13" , 1);
//        myTable.add("Mohammed13da" , 1);
//        myTable.add("Mohammed13dvv" , 1);
//        myTable.add("Mohammed13czv" , 1);
//        myTable.add("Mohammed13ad" , 1);
//        myTable.add("Mohammed13e" , 1);
//        System.out.println(myTable);
//        System.out.println(myTable.contains("Mohammed13e"));
//        String sen = "HELLO AFADG AFADG, SDFDAS HELLO";
//        System.out.println(new Main().firstRepeatedWord(sen));
//        BinaryTree<Integer> myTree1 = new BinaryTree<>();
//        BinaryTree<Integer> myTree2 = new BinaryTree<>();
//
//        myTree1.root = new Node<Integer>(10);
//        myTree1.root.left = new Node<>(20);
//        myTree1.root.right = new Node<>(25);
//        myTree1.root.right.right = new Node<>(40);
//        myTree1.root.right.left = new Node<>(50);
//
//
//        myTree2.root = new Node<Integer>(15);
//        myTree2.root.left = new Node<>(20);
//        myTree2.root.right = new Node<>(25);
//        myTree2.root.right.right = new Node<>(40);
//        myTree2.root.right.left = new Node<>(55);
//        new Main().treeIntersection(myTree1 , myTree2);
//        Integer[] expectedArr = {20,25,40};

        HashTable<String,String> syn = new HashTable<>();
        HashTable<String,String> an = new HashTable<>();
        syn.add("outift", "garb");

        syn.add("fond", "enamored");
        syn.add("wrath", "anger");
        syn.add("diligent", "employed");
        syn.add("guide", "usher");
        syn.add("flow", "1");
        syn.add("b", "2");
        syn.add("c", "3");

        an.add("fond", "averse");
        an.add("wrath", "delight");
        an.add("diligent", "idle");
        an.add("guide", "follow");
        an.add("flow", "jam");
        an.add("flow2", "jam");
        System.out.println(new Main().leftJoin(syn,an));
    }
}

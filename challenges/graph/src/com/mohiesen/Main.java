package com.mohiesen;

public class Main {

    public static void main(String[] args) {
	Graph<String> myGraph = new Graph<>();
        System.out.println(myGraph.addNode("Hello"));
        System.out.println(myGraph.addNode("Helklo"));
        myGraph.addEdge("Hello" , "mor" , 1);
myGraph.addEdge("Helklo" , "mor" , 2);
        System.out.println(myGraph.BFV("Hello"));

    }
}

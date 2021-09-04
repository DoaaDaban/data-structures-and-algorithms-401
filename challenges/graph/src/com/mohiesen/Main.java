package com.mohiesen;

public class Main {

    public static void main(String[] args) {
	Graph<String> myGraph = new Graph<>();
        System.out.println(myGraph.addNode("Hello"));
        System.out.println(myGraph.addNode("Helklo"));
        myGraph.addEdge("Hello" , "mor" , 10);
        myGraph.addEdge("mor" , "Helklo" , 15);
        myGraph.addEdge("Helklo" , "mor" , 2);
        System.out.println(myGraph.DFS("Hello"));

        String[] arr = {"Hello","mor" , "Helklo"};
       String cost =  myGraph.businessTrip(arr);
    }
}

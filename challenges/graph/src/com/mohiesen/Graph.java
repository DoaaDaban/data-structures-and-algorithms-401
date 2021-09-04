package com.mohiesen;

import java.util.*;

public class Graph <T>{
    public final Map<T , Map<T , Integer>>nodes = new HashMap<>();

    public T addNode(T value){
        nodes.put(value , new HashMap<>());

        return (T) nodes.keySet().toArray()[this.nodes.size()-1];
    }

    public void addEdge(T node1 , T node2 , int weight){

        if (!nodes.containsKey(node1))
            addNode(node1);

        if (!nodes.containsKey(node2))
            addNode(node2);

        nodes.get(node1).put(node2 , weight);
        nodes.get(node2).put(node1 , weight);
    }

    public Set<T> getNodes(){
        return nodes.keySet();
    }

    public Set<T> getNeighbours(T node) {
        return nodes.get(node).keySet();
    }

    public int getSize(){
        return this.nodes.size();
    }

    public String businessTrip(String[] cities){
        int totalCost = 0;
        for (int i = 0; i < cities.length-1; i++) {
            if (getNeighbours((T) cities[i]).contains(cities[i+1])){
                totalCost += nodes.get(cities[i]).get(cities[i+1]);

            }
            else {
                totalCost = 0;
                break;
            }

        }
        if(totalCost == 0){
            return "False, " + totalCost + "$";
        }
        else {
            return "True, " + totalCost + "$";
        }
    }
    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                ", size=" + this.nodes.size() +
                '}';
    }
}

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

    public List<T> BFV(T root){
        Queue<T> visited = new LinkedList<>();
        Queue<T> list = new LinkedList<>();
        List<T> traversed = new ArrayList<>();

        list.add(root);
        visited.add(root);

        while (!list.isEmpty()){
            T node = list.remove();
            traversed.add(node);
            for (T singleNode : getNeighbours(node)){
                if (!visited.contains(singleNode)){
                    visited.add(singleNode);
                    list.add(singleNode);
                }
            }
        }
        return traversed;
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

    @Override
    public String toString() {
        return "Graph{" +
                "nodes=" + nodes +
                ", size=" + this.nodes.size() +
                '}';
    }
}

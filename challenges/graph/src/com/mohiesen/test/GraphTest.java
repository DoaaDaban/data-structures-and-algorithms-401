package com.mohiesen.test;

import com.mohiesen.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GraphTest {
    Graph<Integer> testGraph;
    @BeforeEach
    public void init(){
        testGraph = new Graph<>();
    }

    /*
    Add node test
     */

    @Test
    public void testAddNode(){
        testGraph.addNode(15);
        Assertions.assertEquals(1 , testGraph.getNodes().size());
    }

    /*
    Test Add edge
     */

    @Test
    public void testAddEdge(){
        testGraph.addNode(10);
        testGraph.addNode(20);
        testGraph.addEdge(10,20 ,5);
        Assertions.assertEquals(1 , testGraph.getNeighbours(10).size());
        Assertions.assertEquals(1 , testGraph.getNeighbours(20).size());

    }

    /*
    test retrieve all nodes
     */
    @Test
    public void testGetAllNodes(){
        testGraph.addNode(10);
        testGraph.addNode(20);
        Assertions.assertEquals(2 , testGraph.getNodes().size());
    }

    /*
    Test retrieving neighbours
     */

    @Test
    public void testGetNeighbours(){
        testGraph.addNode(10);
        testGraph.addNode(20);
        testGraph.addEdge(10 , 20 , 10);
        Assertions.assertEquals(1 , testGraph.getNeighbours(10).size());
    }

    /*
        test weight
     */

    @Test
    public void testWeight(){
        testGraph.addNode(10);
        testGraph.addNode(20);
        testGraph.addEdge(10 , 20 , 5);
        Assertions.assertEquals(5 , testGraph.nodes.get(10).get(20));
    }

    /*
    Test on node
     */

    @Test
    public void testOneNodeGraph(){
        testGraph.addNode(12);
        testGraph.addEdge(12 , 12 , 1);
        Assertions.assertNotNull(testGraph);
    }

    /*
    Test size
     */

    @Test
    public void testSize(){
        testGraph.addNode(151);
        testGraph.addNode(154);
        testGraph.addNode(153);
        testGraph.addNode(152);
        testGraph.addEdge(151 ,  152 , 3);
        Assertions.assertEquals(4 , testGraph.getSize());
    }

    /*
    Empty graph returns null
     */

    @Test
    public void testEmpty(){
        Assertions.assertEquals(0 , testGraph.nodes.size());
    }

    /*
    Test Breadth first Traversal
     */

    @Test
    public void testBFV(){
        testGraph.addNode(1);
        testGraph.addNode(2);
        testGraph.addNode(3);
        testGraph.addEdge(1 , 2 ,0);
        testGraph.addEdge(2 , 3 ,0);
        Assertions.assertEquals("[1, 2, 3]" , testGraph.BFV(1).toString());
    }

    /*
    Business Trip test
     */

    @Test
    public void testForEmpty(){
        String[] arr ={};
        Assertions.assertEquals("False, 0$" , testGraph.businessTrip(arr));
    }
    @Test
    public void testHappyPath(){
        Graph<String> testGraph1 = new Graph<>();
        testGraph1.addEdge("Hello" , "mor" , 10);
        testGraph1.addEdge("mor" , "Helklo" , 15);

        String[] arr = {"Hello" , "mor"};
        Assertions.assertEquals("True, 10$" , testGraph1.businessTrip(arr));
    }

    @Test
    public void testDFS(){
        testGraph.addNode(10);
        testGraph.addNode(20);
        testGraph.addNode(15);
        testGraph.addNode(25);
        testGraph.addEdge(10,15 ,5);
        testGraph.addEdge(15,20 ,5);
        testGraph.addEdge(20,25 ,5);
        Assertions.assertEquals("[10, 15, 20, 25]" , testGraph.DFS(10).toString());
    }
}

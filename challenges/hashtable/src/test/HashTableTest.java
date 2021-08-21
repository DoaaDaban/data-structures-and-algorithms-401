package test;

import com.mohiesen.HashTable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {
    HashTable<String , Integer> myTest;
    @BeforeEach
    public void init(){
        myTest = new HashTable<>();
        myTest.add("Hello Test" , 1);
    }

    /*
    Tests adding data to Hash table
     */
    @Test
    public void testAdding(){
        Assertions.assertTrue(myTest.contains("Hello Test"));
    }

    /*
        Test retrieving using the get method
     */
    @Test
    public void getTest(){
        Assertions.assertEquals(1 , myTest.get("Hello Test"));
    }

    @Test
    public void testNullValue() {
        Assertions.assertNull(myTest.get("I dont exist"));
    }

    /*
    Test collision handling
     */

    @Test
    public void handleCollisionTest(){
        myTest.add("Hello Test 1" , 2);
        myTest.add("Hello Test 2" , 3);
        myTest.add("Hello Test 3" , 4);
        myTest.add("Hello Test 4" , 5);
        Assertions.assertEquals(5 , myTest.getSize());
    }

    /*
    retrieving value in a collision
     */
    @Test
    public void retFromCollisionTest(){
        myTest.add("Hello Test 1" , 2);
        myTest.add("Hello Test 2" , 3);
        myTest.add("Hello Test 3" , 4);
        myTest.add("Hello Test 4" , 5);

        Assertions.assertEquals(4 , myTest.get("Hello Test 3"));
    }


}

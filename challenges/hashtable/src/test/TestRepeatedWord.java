package test;

import com.mohiesen.HashTable;
import com.mohiesen.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRepeatedWord {
    Main main;
    HashTable<String , Integer> testTable;

    @BeforeEach
    public void init(){
        main = new Main();
        testTable = new HashTable<>();
    }

    /*
        Test the Happy path
     */
    @Test
    public void testRightOutput(){
        String testCaseString = "Hello my name is mohammed Hello Again";
        String outPut = main.firstRepeatedWord(testCaseString);
        Assertions.assertEquals("hello" , outPut);
    }

    /*
    Test with punctuation
     */
    @Test
    public void testWithPunctuation(){
        String testCaseString = "Hello, my, name. is mohammed Hello Again";
        String outPut = main.firstRepeatedWord(testCaseString);
        Assertions.assertEquals("hello" , outPut);
    }

    /*
    Test no repeated words
     */
    @Test
    public void noRepeatedTest(){
        String testCaseString = "Hello, my, name. is mohammed Again";
        String outPut = main.firstRepeatedWord(testCaseString);
        Assertions.assertNull(outPut);
    }
}

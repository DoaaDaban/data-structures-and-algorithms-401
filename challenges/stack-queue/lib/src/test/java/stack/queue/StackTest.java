package stack.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

public class StackTest {
    Stack<Integer> testStack;

    @BeforeEach
    public void init() {
        testStack = new Stack<>();
    }

    @Test
    public void testPush() {
        /**
         * Push one element .
         */

        testStack.push(15);
        Assertions.assertEquals(15 , testStack.peek());

        /**
         * Push multiple elements
         */

        testStack.push(12);
        testStack.push(13);
        testStack.push(14);

        Assertions.assertEquals(3 , testStack.getIdx());
    }

    @Test
    public void testPop() {
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        /**
         * Pop one item
         */
        testStack.pop();
        Assertions.assertEquals(1 , testStack.getIdx());

        /**
         * Empty using pop
         */
        testStack.pop();
        testStack.pop();
        Assertions.assertTrue(testStack.isEmpty() , "Return true if the stack was empty");
    }

    @Test
    public void testPeek() {
        testStack.push(1);
        testStack.push(2);
        /**
         * Test for the peek method will return the latest item
         */
        Assertions.assertEquals(2 , testStack.peek());
    }


    @Test
    public void testEmpty() {
        /**
         * test exception for pop and peek (Should throw null pointer exception)
         */

        Assertions.assertThrows(NullPointerException.class , () -> {
                testStack.peek()
                ;});

        Assertions.assertThrows(NullPointerException.class , () -> {
            testStack.pop()
            ;});
    }
}

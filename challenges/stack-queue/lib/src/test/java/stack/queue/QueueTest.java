package stack.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueTest {
    Queue<Integer> testQueue;

    @BeforeEach
    public void init() {
        testQueue = new Queue<>();
    }

    @Test
    public void testEnqueue() {
        /*
          Test to enqueue one value
         */
        testQueue.enqueue(15);
        Assertions.assertEquals(0 , testQueue.getIdx());

        /*
          Enqueue multiple elements
         */

        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);

        Assertions.assertEquals(3 , testQueue.getIdx());
    }

    @Test
    public void testDequeue() {
        /*
          Test dequeue and return value
         */
        testQueue.enqueue(1);
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        testQueue.enqueue(4);
        Assertions.assertEquals(1 , testQueue.peek());
        /*
          Empty a queue using dequeue
         */

        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        Assertions.assertTrue(testQueue.isEmpty() , "Return true if queue is empty");
    }

    @Test
    public void testPeek() {
        /*
          Test peek returns the oldest entered item
         */
        testQueue.enqueue(3);
        testQueue.enqueue(4);
        Assertions.assertEquals(3 , testQueue.peek());
    }


    @Test
    public void testException() {
        Assertions.assertThrows(NullPointerException.class , () -> testQueue.peek());

        Assertions.assertThrows(NullPointerException.class , () -> testQueue.dequeue());
    }
}

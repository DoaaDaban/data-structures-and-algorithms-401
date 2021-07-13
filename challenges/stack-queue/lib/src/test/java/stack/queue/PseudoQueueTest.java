package stack.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PseudoQueueTest {
    PseudoQueue<Integer> pseudoQueue;
    @BeforeEach
    void init() {
        pseudoQueue = new PseudoQueue<>();
    }

    @Test
    void testEnqueue () {
        pseudoQueue.enqueue(150);
        Assertions.assertEquals(0 , pseudoQueue.stack.getIdx());
        pseudoQueue.enqueue(150);
        pseudoQueue.enqueue(150);
        pseudoQueue.enqueue(150);
        Assertions.assertEquals(3 , pseudoQueue.stack.getIdx());

    }
    @Test
    void testDequeue () {
        pseudoQueue.enqueue(150);
        pseudoQueue.enqueue(150);
        pseudoQueue.enqueue(150);
        pseudoQueue.enqueue(150);

        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        pseudoQueue.dequeue();
        Assertions.assertEquals(-1 , pseudoQueue.stack.getIdx());
    }
}

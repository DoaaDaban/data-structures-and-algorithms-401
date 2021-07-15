package stack.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShelterTest {
    AnimalShelter shelterTest;
    /*
    Can successfully initialize a shelter from class .
     */
    @BeforeEach
    public void init() {
        shelterTest = new AnimalShelter();
    }
    /*
    Can enqueue to the shelter class (One and multiple )
     */
    @Test
    public void enqueueTest() {
        /*
        Ensure that case is handled
         */
        shelterTest.enqueue(new Animal("Dog"));
        Assertions.assertEquals( 0, shelterTest.getDogs().getIdx());
        shelterTest.enqueue(new Animal("cat"));
        shelterTest.enqueue(new Animal("dog"));
        shelterTest.enqueue(new Animal("cat"));
        Assertions.assertTrue(shelterTest.getDogs().getIdx() == 1 && shelterTest.getCats().getIdx() == 1 , "Returns true if two of each types succesfully added ");
    }

    @Test
    public void dequeueTest() {
        /*
        Test if we can dequeue no matter what was the case of the preference
         */
        shelterTest.enqueue(new Animal("Dog"));
        shelterTest.enqueue(new Animal("cat"));
        shelterTest.enqueue(new Animal("dog"));
        shelterTest.enqueue(new Animal("cat"));

        shelterTest.dequeue("DoG");
        Assertions.assertEquals( 0, shelterTest.getDogs().getIdx());

        shelterTest.dequeue("dog");
        shelterTest.dequeue("cat");
        shelterTest.dequeue("cAt");
        Assertions.assertTrue(shelterTest.getDogs().getIdx() == -1 && shelterTest.getCats().getIdx() == -1 , "Returns true if both queues are empty");

    }
    /*
    Test dequing from empty shelter
     */
    @Test
    public void testDequiengEmpty() {
        shelterTest.dequeue("dog");
     Assertions.assertFalse(shelterTest.getDogs().getIdx() != -1 , "Returns false if a successful deque occured ");
    }
}

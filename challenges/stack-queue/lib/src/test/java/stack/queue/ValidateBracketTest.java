package stack.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidateBracketTest {
    Library library;
    @BeforeEach
    public void init() {
        library = new Library();
    }

    /*
    Test to validate empty string param
     */
    @Test
    public void testEmpty() {
        String emptyTest = "";
        Assertions.assertFalse(library.validateBrackets(emptyTest) , "Returns true if the method returns false");
    }

    /*
Test to validate balance string param
 */
    @Test
    public void testBalanced() {
        String balancedTest = "(){}{[]}";
        Assertions.assertTrue(library.validateBrackets(balancedTest) , "Returns true if the method returns true");
    }    /*
    Test to validate balanced with characters string param
     */
    @Test
    public void testBalancedWithChars() {
        String balancedWithChars = "[Test]{}[code](Love)";
        Assertions.assertTrue(library.validateBrackets(balancedWithChars) , "Returns true if the String with characters is balanced");
    }    /*
    Test to validate NOT balanced string param
     */
    @Test
    public void testNonBalanced() {
        String nonBalanced = "";
        Assertions.assertFalse(library.validateBrackets(nonBalanced) , "Returns true if the method returns false as non balanced");
    }
}

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities utils;

    @org.junit.Before
    public void setup() {
        utils = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'e', 'l'};
        assertArrayEquals(output, utils.everyNthChar(input, 2));
        assertArrayEquals(input, utils.everyNthChar(input, 8));
    }

    @Test
    public void removePairs() {
        assertEquals("ABCDEF", utils.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utils.removePairs("ABCCABDEEF"));
        assertNull(utils.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, new Utilities().converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_exception() {
        assertEquals(300, new Utilities().converter(10, 5));
        new Utilities().converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(new Utilities().nullIfOddLength("Marko"));
        assertNotNull(new Utilities().nullIfOddLength("Hrvoje"));
    }
}
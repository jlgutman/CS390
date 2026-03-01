package lesson4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void findMinimumCharacter() {
        String s = Problem1.findMinimumCharacter("akel");
        assertEquals("a", s);

        s = Problem1.findMinimumCharacter("jose");
        assertEquals("e", s);

        s = Problem1.findMinimumCharacter("luis");
        assertEquals("i", s);

        s = Problem1.findMinimumCharacter("zebra");
        assertEquals("a", s);

        s = Problem1.findMinimumCharacter("z");
        assertEquals("z", s);

        s = Problem1.findMinimumCharacter("");
        assertNull(null, s);

        s = Problem1.findMinimumCharacter(null);
        assertNull(null, s);
    }

    @Test
    void reverse() {
        int[] arr = Problem2.reverse(new int[]{1, 3, 5, 7, 9, 13});
        assertArrayEquals(new int[]{13, 9, 7, 5, 3, 1}, arr);

        arr = Problem2.reverse(new int[]{42, 7, 19, 3, 88, 55, 1});
        assertArrayEquals(new int[]{1, 55, 88, 3, 19, 7, 42}, arr);

        arr = Problem2.reverse(new int[]{10, 20});
        assertArrayEquals(new int[]{20, 10}, arr);

        arr = Problem2.reverse(new int[]{});
        assertArrayEquals(new int[]{}, arr);

        arr = Problem2.reverse(null);
        assertNull(arr);
    }

    @Test
    void isPalindrome() {
        boolean result = Problem3.isPalindrome(121);
        assertTrue(result);

        result = Problem3.isPalindrome(-121);
        assertFalse(result);

        result = Problem3.isPalindrome(102);
        assertFalse(result);
    }

    @Test
    void findMaxValue() {
        int result = Problem4.findMaxValue(new int[]{5, -3, 6, 1, 9, 4});
        assertEquals(9, result);

        result = Problem4.findMaxValue(new int[]{});
        assertEquals(0, result);

        result = Problem4.findMaxValue(new int[]{1});
        assertEquals(1, result);

        result = Problem4.findMaxValue(new int[]{-10, -3, -7, -1});
        assertEquals(-1, result);
    }
}
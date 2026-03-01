package lesson4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void findMaxValue() {
        int result = Problem4.findMaxValue(new int[]{5, -3, 6, 1, 9, 4});
        assertEquals(result, 9);
        result = Problem4.findMaxValue(new int[]{});
        assertEquals(result, 0);
        result = Problem4.findMaxValue(new int[]{1});
        assertEquals(result, 1);
        result = Problem4.findMaxValue(new int[]{-10, -3, -7, -1});
        assertEquals(result, -1);
    }
}
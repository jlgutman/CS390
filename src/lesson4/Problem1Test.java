package lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void findMinimumCharacter() {
        String s = Problem1.findMinimumCharacter("akel");
        assertEquals(s, "a");
        s = Problem1.findMinimumCharacter("jose");
        assertEquals(s, "e");
        s = Problem1.findMinimumCharacter("luis");
        assertEquals(s, "i");
        s = Problem1.findMinimumCharacter("zebra");
        assertEquals(s, "a");
        s = Problem1.findMinimumCharacter("z");
        assertEquals(s, "z");
        s = Problem1.findMinimumCharacter("");
        assertEquals(s, null);
        s = Problem1.findMinimumCharacter(null);
        assertEquals(s, null);

    }
}
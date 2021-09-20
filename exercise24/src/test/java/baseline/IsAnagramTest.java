/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsAnagramTest {

    @Test
    void testIsAnagram() {
        assertTrue(IsAnagram.isAnagram("racecar", "racecar"),
                "Program always returns false");
        assertFalse(IsAnagram.isAnagram("e", "d"), "Program always returns true");
        assertTrue(IsAnagram.isAnagram("Pineapple", "elppaeniP"),
                "Program can't handle case sensitivity");
        assertFalse(IsAnagram.isAnagram("apple", "ELPPA"), "Program ignores case sensitivity");
        assertTrue(IsAnagram.isAnagram("Bees and wasps", "spsaw dna seeB"),
                "Program can't handle spaces");
    }
}
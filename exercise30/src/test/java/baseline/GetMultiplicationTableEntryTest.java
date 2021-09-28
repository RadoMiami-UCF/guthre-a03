/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetMultiplicationTableEntryTest {

    @Test
    void testGetMultiplicationTableEntry() {
        assertEquals("   36", GetMultiplicationTableEntry.getMultiplicationTableEntry(6, 6),
                "Multiplication table failed #1");
        assertEquals("  144", GetMultiplicationTableEntry.getMultiplicationTableEntry(12, 12),
                "Multiplication table failed #2");
        assertEquals("  108", GetMultiplicationTableEntry.getMultiplicationTableEntry(9, 12),
                "Multiplication table failed #3");
    }
}
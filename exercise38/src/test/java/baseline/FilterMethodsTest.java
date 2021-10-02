/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterMethodsTest {

    @Test
    void testFilterEvenNumbers() {
        assertArrayEquals(new int[]{0, 2, 4}, FilterMethods.filterEvenNumbers(new String[]{"0", "2", "4"}),
                "filterEvenNumbers not letting even numbers through");
        assertArrayEquals(new int[]{6, 8, 4}, FilterMethods.filterEvenNumbers(new String[]{"3", "5", "6", "7", "8", "4"}),
                "filterEvenNumbers not filtering out odd numbers #1");
        assertArrayEquals(new int[]{2, 6, 8, 12}, FilterMethods.filterEvenNumbers(new String[]{"3", "2", "6", "7", "8", "9",
                        "12"}), "filterEvenNumbers not filtering out odd numbers #2");
    }
}
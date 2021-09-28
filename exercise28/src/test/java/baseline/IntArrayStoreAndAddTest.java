/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayStoreAndAddTest {

    @Test
    void testGetIntSum() {
        assertEquals(10, IntArrayStoreAndAdd.getIntSum(new int[]{1, 2, 3, 4}), "How did I mess up " +
                "adding numbers?");
        assertEquals(123, IntArrayStoreAndAdd.getIntSum(new int[]{100, 23}), "Seriously, it's just " +
                "addition.");
        assertEquals(1234, IntArrayStoreAndAdd.getIntSum(new int[]{1234}), "Improper handling of " +
                "single element arrays");
    }
}
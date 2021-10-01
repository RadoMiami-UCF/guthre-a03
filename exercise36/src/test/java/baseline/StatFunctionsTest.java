/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatFunctionsTest {

    @Test
    void testAverage() {
        assertEquals(3.5, StatFunctions.average(Arrays.asList(1.0, 2.0, 5.0, 6.0)), 0.0001,
                "Function failed to get correct average #1");
        assertEquals(15, StatFunctions.average(Arrays.asList(14.0, 15.0, 16.0)), 0.0001,
                "Function failed to get correct average #2");
        assertEquals(1000, StatFunctions.average(Arrays.asList(1.0, 100.0, 1900.0, 1999.0)), 0.0001,
                "Function failed to get correct average #3");
    }

    @Test
    void testMax() {
        assertEquals(123, StatFunctions.max(Arrays.asList(0.1, 12.34, 123.0)), 0.0001,
                "Function failed to get correct max #1");
        assertEquals(0.1, StatFunctions.max(Arrays.asList(-43.0, -76.0, 0.1, -120.0)), 0.0001,
                "Function failed to get correct max #2");
        assertEquals(3019, StatFunctions.max(Arrays.asList(0.1, 82.0, -9140.2, 3019.0, 3018.9)), 0.0001,
                "Function failed to get correct max #3");
    }

    @Test
    void testMin() {
        assertEquals(2, StatFunctions.min(Arrays.asList(4.0, 6.0, 2.0, 3.0)), 0.0001,
                "Function failed to get correct min #1");
        assertEquals(-2, StatFunctions.min(Arrays.asList(6.2, -2.0, -0.5, 1.9)), 0.0001,
                "Function failed to get correct min #2");
        assertEquals(-942, StatFunctions.min(Arrays.asList(67.0, -942.0, -463.0, 71.0)), 0.0001,
                "Function failed to get correct min #3");
    }

    @Test
    void testStd() {
        assertEquals(4.8989794855664, StatFunctions.std(Arrays.asList(10.0, 12.0, 23.0, 23.0, 16.0, 23.0, 21.0,
                16.0)), 0.0000001, "Function failed to get correct standard deviation #1");
        assertEquals(20.339370688396, StatFunctions.std(Arrays.asList(46.0, 27.0, 42.0, 20.0, 83.0, 44.0, 47.0,
                60.0, 5.0, 45.0)), 0.0000001, "Function failed to get correct standard deviation #2");
        assertEquals(0, StatFunctions.std(List.of(1984.83)), 0.0000001,
                "Function fails to properly account for lists of size 1");
    }
}
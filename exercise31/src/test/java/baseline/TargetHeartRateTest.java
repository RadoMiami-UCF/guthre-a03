/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TargetHeartRateTest {

    @Test
    void testCalcHeartRate() {
        assertEquals(151, TargetHeartRate.calcHeartRate(22, 65, .65),
                "Basic error #1");
        assertEquals(144, TargetHeartRate.calcHeartRate(42, 65, .70),
                "Basic error #2");
        assertEquals(172, TargetHeartRate.calcHeartRate(20, 60, .80),
                "Basic error #3");
    }
}
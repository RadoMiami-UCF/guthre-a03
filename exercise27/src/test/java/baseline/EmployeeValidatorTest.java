/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeValidatorTest {

    /*
    These tests were commented out because they now refer to private methods. Un-private them if you want to test!
    @Test
    void testNameChecker() {
        assertArrayEquals(new boolean[]{false, false}, EmployeeValidator.nameChecker("Bob"),
                "Name length errors unnecessarily tripping");
        assertArrayEquals(new boolean[]{true, false}, EmployeeValidator.nameChecker("P"),
                "Name length error alone not tripping");
        assertArrayEquals(new boolean[]{true, true}, EmployeeValidator.nameChecker(""),
                "Empty name error not tripping");
    }

    @Test
    void testZipChecker() {
        assertTrue(EmployeeValidator.zipChecker("pda"), "Error not tripping for non-zipcodes");
        assertTrue(EmployeeValidator.zipChecker("123"), "Error not tripping for short zipcodes");
        assertTrue(EmployeeValidator.zipChecker("1234567"),
                "Error not tripping for overly long zipcodes");
        assertFalse(EmployeeValidator.zipChecker("12345"), "Error unnecessarily tripping");
    }

    @Test
    void testIDChecker() {
        assertTrue(EmployeeValidator.idChecker("Error!"), "Error not tripping for incorrect formats");
        assertTrue(EmployeeValidator.idChecker("ABC-1234"),
                "Error not tripping for partial format match-ups #1");
        assertTrue(EmployeeValidator.idChecker("AB-12345"),
                "Error not tripping for partial format match-ups #2");
        assertFalse(EmployeeValidator.idChecker("AB-1234"), "Error unnecessarily tripping");
    }
     */
}
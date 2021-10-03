/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDataTest {

    @Test
    void testToStringForChart() {
        var testEmployeeData = new EmployeeData("Bob", "Chris", "Intern");
        assertEquals("Bob Chris | Intern |",
                testEmployeeData.toStringForChart(10, 7),
                "Employee data not printed properly #1");
        assertEquals("Bob Chris    | Intern   |",
                testEmployeeData.toStringForChart(13, 9),
                "Employee data not printed properly #2");
        testEmployeeData = new EmployeeData("Steve", "Smith", "Head Teller", 12,
                Calendar.DECEMBER, 2021);
        assertEquals("Steve Smith | Head Teller | 2021-12-12",
                testEmployeeData.toStringForChart(12, 12),
                "Employee separation date not printed properly");
    }

    @Test
    void testCompareTo() {
        var testEmployeeDataSmall = new EmployeeData("Aaron", "Andrew", "Lemon Supplier");
        var testEmployeeDataLarge = new EmployeeData("Z I don't know any Z first names", "Zebra",
                "Intern again");
        var testEmployeeDataSameAsSmall = new EmployeeData("Aaron", "Andrew",
                "Lemon Supplier");
        assertTrue(testEmployeeDataSmall.compareTo(testEmployeeDataLarge) < 0,
                "Employee did not properly identify as smaller");
        assertTrue(testEmployeeDataLarge.compareTo(testEmployeeDataSmall) > 0,
                "Employee did not properly identify as larger");
        assertEquals(0, testEmployeeDataSmall.compareTo(testEmployeeDataSameAsSmall),
                "Employee did not properly identify as the same");
    }
    //Equals isn't tested because it isn't even used.
}
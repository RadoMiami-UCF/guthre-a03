/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {

    private static final Map<Integer, EmployeeData> JOHN_JOHNSON_MAP = Map.of(0, new EmployeeData(
            "John", "Johnson", "Manager", 31, Calendar.DECEMBER,
            2016));
    private static final Map<Integer, EmployeeData> TOU_XIONG_MAP = Map.of(0, new EmployeeData(
            "Tou", "Xiong", "Software Engineer", 5, Calendar.OCTOBER,
            2016));
    private static final Map<Integer, EmployeeData> TOU_JONES_MAP = Map.of(0, new EmployeeData(
            "Tou", "Jones", "District Manager", 19, Calendar.DECEMBER,
            2015));
    /*
    This test is commented out because it uses to a method that is now private. Make the method public to use the test!
    @Test
    void testTrimUnneededEntries() {
        ArrayList<Map<Integer, EmployeeData>> testMapList = new ArrayList<>(Arrays.asList(JOHN_JOHNSON_MAP,
        TOU_XIONG_MAP, TOU_JONES_MAP));
        Solution40.trimUnneededEntries(testMapList, "John");
        assertEquals((new ArrayList<>(List.of(JOHN_JOHNSON_MAP))), testMapList,
        "trimUnneededEntries fails to trim unneeded entries #1");
        testMapList = new ArrayList<>(Arrays.asList(JOHN_JOHNSON_MAP, TOU_XIONG_MAP,
                TOU_JONES_MAP));
        Solution40.trimUnneededEntries(testMapList, "Xiong");
        assertEquals((new ArrayList<>(List.of(TOU_XIONG_MAP))), testMapList,
        "trimUnneededEntries fails to trim unneeded entries #2");
        testMapList = new ArrayList<>(Arrays.asList(JOHN_JOHNSON_MAP, TOU_XIONG_MAP,
                TOU_JONES_MAP));
        ArrayList<Map<Integer, EmployeeData>> expectedMapList =
                new ArrayList<>(Arrays.asList(TOU_XIONG_MAP, TOU_JONES_MAP));
        Solution40.trimUnneededEntries(testMapList, "Tou");
        assertEquals(testMapList, expectedMapList, "trimUnneededEntries fails to trim unneeded entries #3");
    }
     */
}
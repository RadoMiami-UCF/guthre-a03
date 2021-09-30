/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void testSayArrayList() {
        ArrayList<String> testArrayList = new ArrayList<>(Arrays.asList("Bob", "Steve", "Chris"));
        testArrayList.trimToSize();
        assertEquals("There are 3 employees:\nBob\nSteve\nChris\n", Solution34.sayArrayList(testArrayList),
                "General failure #1");
        testArrayList = new ArrayList<>(Arrays.asList("Rob", "Bob", "Jobs", "Tim"));
        testArrayList.trimToSize();
        assertEquals("There are 4 employees:\nRob\nBob\nJobs\nTim\n", Solution34.sayArrayList(testArrayList),
                "General failure #2");
    }
}
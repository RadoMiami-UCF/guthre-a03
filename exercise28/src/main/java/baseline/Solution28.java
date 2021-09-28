/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

public class Solution28 {
    private static final int NUMBERS_TO_ADD = 5;
    public static void main(String[] args) {
        //First, create an object with two methods (to set and to get the sum of an array) that contains an array.
        // Then, use that object to start a loop that runs 5 times.
        var iArray = new IntArrayStoreAndAdd(NUMBERS_TO_ADD);
        iArray.setIntArray();
        //After the loop, add all the numbers together.
        var sumToPrint = iArray.getIntSum();
        //Finally, print the sum.
    }
}

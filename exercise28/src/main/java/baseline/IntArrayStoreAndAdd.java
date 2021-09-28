/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

final class IntArrayStoreAndAdd {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private int[] intArray;

    public IntArrayStoreAndAdd(int arraySize) {
        //Initialize the object the integer array is stored in, taking the size of the array as an arg.
        if(arraySize > 0) {
            intArray = new int[arraySize];
        }
    }

    public void setIntArray() {
        for(var j = 0; j < intArray.length; j++) {
            /*
            In this loop, ask for and store a number (probably in an array, using the iteration of the loop as the
            index)
            */
            System.out.print("Enter a number: ");
            intArray[j] = in.nextInt();
        }
    }

    public int getIntSum() {
        //Using the testing overload to prevent code duplication!
        return getIntSum(intArray);
    }

    public static int getIntSum(int[] arrayToFindSum) {
        /*
        This overload is only here to serve as an easier function to test. Usually, intArray is locked as a private
        instance variable (probably for the better), which would make it impossible to test without faffing about with
        the visibility. This overload just makes my life easier.
         */
        var sum = arrayToFindSum[0];
        for(var j = 1; j < arrayToFindSum.length; j++) {
            //In this loop, add the current element of the array to sum, starting from the second element.
            sum += arrayToFindSum[j];
        }
        //Then return sum.
        return sum;
    }
}

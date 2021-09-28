/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

class IntArrayStoreAndAdd {
    private int[] intArray;
    public IntArrayStoreAndAdd(int arraySize) {
        //Initialize the object the integer array is stored in, taking the size of the array as an arg.
    }

    public void setIntArray() {
        for(var j = 0; j < intArray.length; j++) {
            /*
            In this loop, ask for and store a number (probably in an array, using the iteration of the loop as the
            index)
            */
        }
    }

    public int getIntSum() {
        var sum = intArray[0];
        for(var j = 1; j < intArray.length; j++) {
            //In this loop, add the current element of the array to sum, starting from the second element.
        }
        //Then return sum.
        return sum;
    }
}

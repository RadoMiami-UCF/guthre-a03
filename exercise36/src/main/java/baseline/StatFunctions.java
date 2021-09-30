/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.Collection;

final class StatFunctions {
    public static double average(Collection<Double> doubleList) {
        //Simply return all the numbers added together divided by the length of the list.
        return 0;
    }

    public static double max(Collection<Double> doubleList) {
        //First, store the first member of the list in a variable. We'll call it maxNum.
        //Use a for loop to iterate through every other member of the list.
        //If that member of the list is bigger, replace maxNum with that member.
        //Finally, after the for loop, return maxNum.
        return 0;
    }

    public static double min(Collection<Double> doubleList) {
        //Do the same as max, but replace bigger with smaller and maxNum with minNum.
        return 0;
    }

    public static double std(Collection<Double> doubleList) {
        //First, take the difference between each element of the list and average(doubleList), square them, and find
        //the sum of that. Preferably, store that in a variable.
        //Then, divide that variable by doubleList.size() - 1.
        //Finally, return the square root of the divided variable.
        return 0;
    }
}

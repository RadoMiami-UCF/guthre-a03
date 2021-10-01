/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.Collection;
import java.util.List;

final class StatFunctions {
    private static final double EXPONENT_OF_SQUARE = 2;
    private static final double EXPONENT_OF_SQUARE_ROOT = 0.5;

    private StatFunctions() {}

    public static double average(Collection<Double> doubleList) {
        //Simply return all the numbers added together divided by the length of the list.
        double sum = 0;
        for (double doubleFromList : doubleList) {
            sum += doubleFromList;
        }
        return (sum / doubleList.size());
    }

    public static double max(List<Double> doubleList) {
        //First, store the first member of the list in a variable. We'll call it maxNum.
        var maxNum = doubleList.get(0);
        //Use a for loop to iterate through every other member of the list.
        for(var j = 1; j < doubleList.size(); j++) {
            //If that member of the list is bigger, replace maxNum with that member.
            if(doubleList.get(j) > maxNum) {
                maxNum = doubleList.get(j);
            }
        }
        //Finally, after the for loop, return maxNum.
        return maxNum;
    }

    public static double min(List<Double> doubleList) {
        //First, store the first member of the list in a variable. We'll call it minNum.
        var minNum = doubleList.get(0);
        //Use a for loop to iterate through every other member of the list.
        for(var j = 1; j < doubleList.size(); j++) {
            //If that member of the list is smaller, replace minNum with that member.
            if(doubleList.get(j) < minNum) {
                minNum = doubleList.get(j);
            }
        }
        //Finally, after the for loop, return minNum.
        return minNum;
    }

    public static double std(List<Double> doubleList) {
        //First, take the difference between each element of the list and average(doubleList), square them, and find
        //the sum of that. Preferably, store that in a variable.
        if(doubleList.size() != 1) {
            double variance = 0;
            for(double doubleFromList : doubleList) {
                variance += Math.pow((doubleFromList - average(doubleList)), EXPONENT_OF_SQUARE);
            }
            //Then, divide that variable by doubleList.size() - 1.
            variance = variance / doubleList.size();
            //Finally, return the square root of the divided variable.
            return Math.pow(variance, EXPONENT_OF_SQUARE_ROOT);
        } else {
            //If the list is one element long, just return zero for the standard deviation.
            return 0;
        }
    }
}

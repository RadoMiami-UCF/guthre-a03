/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

final class FilterMethods {
    private static final Logger EXCEPTION_LOGGER = Logger.getLogger("filterMethodsLogger");
    private static final int EVEN_NUMBER_MODULO = 2;

    private FilterMethods() {}

    public static int[] filterEvenNumbers(String[] numbersToFilter) {
        //First, create an arraylist of integers. We'll call it evenNumberList.
        ArrayList<Integer> evenNumberList = new ArrayList<>();
        //Then, for each string given, convert it into an integer.
        for(String numberToFilter : numbersToFilter) {
            //If the integer is even, add it to evenNumberList.
            try {
                if(Integer.parseInt(numberToFilter) % EVEN_NUMBER_MODULO == 0) {
                    evenNumberList.add(Integer.parseInt(numberToFilter));
                }
            } catch (NumberFormatException exception) {
                EXCEPTION_LOGGER.log(Level.WARNING, "Member of array numbersToFilter was not an integer!");
            }

        }
        //Then, trim to size to ensure that the array is only big enough to hold its numbers.
        evenNumberList.trimToSize();
        //After the loop, set a new array of integers (primitive) to evenNumberList using another loop.
        //evenNumberList.toArray won't work because I need type integer (primitive), not type integer (object).
        var intArray = new int[evenNumberList.size()];
        for(var j = 0; j < evenNumberList.size(); j++) {
            intArray[j] = evenNumberList.get(j);
        }
        //Then, return this array of integers.
        return intArray;
    }
}

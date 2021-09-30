/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution36 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final DecimalFormat doubleFormat = new DecimalFormat("0.##");
    
    public static void main(String[] args) {
        //First, create a new arrayList.
        ArrayList<Double> doubleList = new ArrayList<>();
        //Then, use a while loop to populate said list with doubles inputted from the user.
        while(true) {
            System.out.print("Enter a number: ");
            var inString = in.nextLine();
            if(Pattern.matches("\\d+", inString)) {
                doubleList.add(Double.parseDouble(inString));
            } else if("done".equals(inString)) {
                break;
            }
        }
        //When the user inputs "done" instead of another double, break the loop.
        //After the loop, trim the arraylist's size.
        doubleList.trimToSize();
        //Then, print doubleList through printNumbers.
        printNumbers(doubleList);
        //Finally, say the results of StatFunctions.average, min, max, and std.
        System.out.print("The average is ")
    }

    private static void printNumbers(List<Double> doubleList) {
        //First, say "Numbers: ".
        System.out.print("Numbers:");
        //Then, print each of the numbers in doubleList.
        for(var j = 0; j < doubleList.size(); j++) {
            //First, print a space, then the number in the index j of doubleList.
            System.out.print(" " + doubleList.get(j));
            //If it isn't the last one, also print ",".
            if(j < doubleList.size() - 1) {
                System.out.print(",");
            }
        }
    }
}

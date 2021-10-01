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
            } else {
                //Combining these into an if else causes SonarLint to get mad for whatever reason.
                if("done".equals(inString)) {
                    break;
                }
            }
        }
        //When the user inputs "done" instead of another double, break the loop.
        //After the loop, trim the arraylist's size.
        doubleList.trimToSize();
        //Then, print doubleList through printNumbers.
        printNumbers(doubleList);
        //Finally, print the results of the statFunctions methods through printStatFunctionsResults.
        printStatFunctionsResults(doubleList);
    }

    private static void printNumbers(List<Double> doubleList) {
        //First, say "Numbers: ".
        System.out.print("Numbers:");
        //Then, print each of the numbers in doubleList.
        for(var j = 0; j < doubleList.size(); j++) {
            //First, print a space, then the number in the index j of doubleList.
            System.out.print(" " + doubleFormat.format(doubleList.get(j)));
            //If it isn't the last one, also print ",".
            if(j < doubleList.size() - 1) {
                System.out.print(",");
            }
        }
    }

    private static void printStatFunctionsResults(List<Double> doubleList) {
        //Finally, say the results of StatFunctions.average, min, max, and std.
        //I wanted to use a stringBuilder. SonarLint said no.
        String outputBuilder = "\nThe average is " + doubleFormat.format(StatFunctions.average(doubleList))
                + "\nThe minimum is " + doubleFormat.format(StatFunctions.min(doubleList))
                + "\nThe maximum is " + doubleFormat.format(StatFunctions.max(doubleList))
                + "\nThe standard deviation is " + doubleFormat.format(StatFunctions.std(doubleList));
        System.out.print(outputBuilder);
    }
}

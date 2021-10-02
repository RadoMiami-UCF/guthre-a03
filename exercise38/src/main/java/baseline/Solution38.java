/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution38 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, ask for a list of numbers.
        System.out.print("Enter a list of numbers, separated by spaces: ");
        //Then, split that list into an array of strings using String.split(" ", 0).
        String[] arrayOfNumberStrings = (in.nextLine()).split(" ", 0);
        //Then, pass that array into FilterMethods.filterEvenNumbers.
        int[] arrayOfEvenIntegers = FilterMethods.filterEvenNumbers(arrayOfNumberStrings);
        //Finally, print out the resulting array of integers, using a for loop
        //(as Array.toString() won't be formatted properly.)
        var outputEvenIntegers = new StringBuilder("The even numbers are");
        for (int evenInteger : arrayOfEvenIntegers) {
            outputEvenIntegers.append(" ").append(evenInteger);
        }
        outputEvenIntegers.append(".");
        System.out.print(outputEvenIntegers);
    }
}

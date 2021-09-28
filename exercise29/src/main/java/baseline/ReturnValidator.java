/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Pattern;

final class ReturnValidator {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    private ReturnValidator() {}

    public static double badInputChecker() {
        String inString;
        while(true) {
            System.out.print("What is the rate of return? ");
            inString = in.nextLine();
            if(validateInput(inString)) {
                //If the rate of return is a valid input, then return it in double form.
                return Double.parseDouble(inString);
            } else {
                //If the rate of return is an invalid input, then say that it isn't a valid input and ask again.
                System.out.println("Sorry. That's not a valid input.");
            }
        }
    }

    public static boolean validateInput(String inString) {
        //If the rate of return is a non-zero integer or decimal, return true. Otherwise, return false.
        return !(Pattern.matches("0+", inString) || Pattern.matches("0+?.0+", inString))
                && (Pattern.matches("\\d+", inString) || Pattern.matches("\\d+?.\\d+", inString));
    }
}

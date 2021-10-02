/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution37 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, prompt for the minimum length.
        var length = sayThenGetInt("What's the minimum length? ");
        //Then, prompt for the number of special characters.
        var specialCharacterCount = sayThenGetInt("How many special characters? ");
        //Then, prompt for the number of numbers.
        var numberCount = sayThenGetInt("How many numbers? ");
        //If the number of special characters and numbers is higher than half of the minimum length rounded down,
        //set the length to the number of (special characters + numbers) * 2.
        if(length < (specialCharacterCount + numberCount) * 2) {
            length = (specialCharacterCount + numberCount) * 2;
        }
        //Then, use PasswordGen.generatePassword(minLength, specialChars, numbers).
        //Finally, report the password back to the user.
        System.out.print("Your password is "
                + PasswordGen.generatePassword(length, specialCharacterCount, numberCount));
    }

    private static int sayThenGetInt(String sayString) {
        System.out.print(sayString);
        return in.nextInt();
    }
}
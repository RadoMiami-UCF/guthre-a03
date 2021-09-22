/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
/*
Weird how SonarLint keeps complaining about the lack of a header when it's literally RIGHT THERE.
Just wanted to vent (✿◕‿◕)
Also, no, I did not write all this code in less than 14 minutes, for anyone who looked at the previous commit.
It took more than a day trying to learn how regexes and patterns worked.
I just hope that exercise26 isn't so bad.
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution25 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, take in and store a password.
        System.out.print("What is the password that should be checked? ");
        String password = in.nextLine();
        String passStrength = switch (PasswordValidator.passwordValidator(password)) {
            case PasswordStrengthValueMeaning.VERY_WEAK_PASS_NUM -> "very weak";
            case PasswordStrengthValueMeaning.WEAK_PASS_NUM -> "weak";
            case PasswordStrengthValueMeaning.STRONG_PASS_NUM -> "strong";
            case PasswordStrengthValueMeaning.VERY_STRONG_PASS_NUM -> "very strong";
            default -> "unknown strength";
        };
        //Then, check the password using passwordValidator.
        //Then, report the password and its strength to the user.
        System.out.print("The password '" + password + "' is a " + passStrength + " password.");
    }
}

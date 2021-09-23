/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

final class PasswordValidator{
    private static final int MIN_STRONG_PASS_LENGTH = 8;

    private static final Pattern LETTERS = Pattern.compile("[\\p{IsAlphabetic}]+");
    private static final Pattern LETTERS_AND_NUMBERS = Pattern.compile("[\\p{IsAlphabetic}\\d]+");
    private static final Pattern LETTERS_NUMBERS_SPECIAL_CHARACTERS
            = Pattern.compile("[\\p{IsAlphabetic}\\d[^\\p{IsAlphabetic}\\d]]+");
    //If none of the conditions in PasswordStrengthValueMeaning are satisfied, the password is of strength 0.

    private PasswordValidator() {

    }

    public static int passwordValidator(@NotNull String password) {

        if(password.length() < MIN_STRONG_PASS_LENGTH) {
            return passwordValidateShort(password);
        } else {
            return passwordValidateLong(password);
        }
    }

    private static int passwordValidateShort(String password) {
        if(Pattern.matches("\\d+", password)) {
            //if the password contains just numbers
            return PasswordStrengthValueMeaning.VERY_WEAK_PASS_NUM;
        } else if((LETTERS.matcher(password)).matches()) {
            //if the password contains just letters
            return PasswordStrengthValueMeaning.WEAK_PASS_NUM;
        } else {
            //if none of the above are satisfied
            return 0;
        }
    }

    private static int passwordValidateLong(String password) {
        boolean lettersOrNumbers = Pattern.matches("\\d+", password) || (LETTERS.matcher(password)).matches();
        boolean lettersAndNumbers = (LETTERS_AND_NUMBERS.matcher(password)).matches() && !lettersOrNumbers;
        if(lettersAndNumbers) {
            //if the password contains letters, numbers, and special characters
            return PasswordStrengthValueMeaning.STRONG_PASS_NUM;
        } else if(LETTERS_NUMBERS_SPECIAL_CHARACTERS.matcher(password).matches() && !lettersOrNumbers) {
            //if the password contains letters and numbers
            return PasswordStrengthValueMeaning.VERY_STRONG_PASS_NUM;
        } else {
            //if none of the above are satisfied
            return 0;
        }
    }
}

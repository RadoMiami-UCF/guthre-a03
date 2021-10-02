/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGenTest {

    @Test
    void testGeneratePassword() {
        assertTrue(passwordFitsParameters(PasswordGen.generatePassword(8, 1, 2),
                8, 1, 2), "Password generated does not fit parameters #1");
        assertTrue(passwordFitsParameters(PasswordGen.generatePassword(12, 3, 3),
                12, 3, 3), "Password generated does not fit parameters #2");
        assertTrue(passwordFitsParameters(PasswordGen.generatePassword(16, 4, 2),
                16, 4, 2), "Password generated does not fit parameters #3");
    }

    @Test
    void testShufflePassword() {
        ArrayList<Character> passwordArrayList = new ArrayList<>(Arrays.asList('b', 'a', 'c', 'o', 'n',
                '4', '7', 'a', 'b', 'c', 'x', 'y', 'z'));
        assertNotEquals("bacon47abcxyz", PasswordGen.shufflePassword(passwordArrayList), "Input was not scrambled");
    }

    private boolean passwordFitsParameters(String password, int length, int specialCharacters,
                                                        int numbers) {
        int trueSpecialCharacters = 0;
        int trueNumbers = 0;
        for(var j = 0; j < password.length(); j++) {
            //If the character at index j is a number, increment trueNumbers. If it's a special character, increment
            //trueSpecialCharacters. If it's whitespace, return false (as there shouldn't be whitespaces).
            if(Pattern.matches("\\d", Character.toString(password.charAt(j)))) {
                trueNumbers++;
            } else if(Pattern.matches("[\\S&&[^\\p{IsAlphabetic}]]", Character.toString(password.charAt(j)))) {
                trueSpecialCharacters++;
            } else if(Pattern.matches("\\s", Character.toString(password.charAt(j)))) {
                return false;
            }
        }

        //If the password doesn't fit the parameters given, return false. Otherwise, return true.
        return password.length() == length && numbers == trueNumbers && trueSpecialCharacters == specialCharacters;
    }
}
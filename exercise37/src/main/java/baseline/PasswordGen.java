/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

final class PasswordGen {
    //Sorry 19reviewer, or whoever is looking at this, but this is the best I could do.
    private static final String VALID_LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String VALID_NUMBERS = "1234567890";
    private static final String VALID_SPECIAL_CHARACTERS = "!\"#$%&'()*+,-./:;<=>?@[|]^_{\\}~`";
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();


    private PasswordGen() {}

    public static String generatePassword(int length, int specialCharacters, int numbers) {
        //First, create a new random number generator and arraylist of characters.
        ArrayList<Character> passwordArrayList = new ArrayList<>(length);
        //Then, generate the amount of special characters and add that to a list of characters.
        for(var j = 0; j < specialCharacters; j++) {
            passwordArrayList.add(VALID_SPECIAL_CHARACTERS.charAt(RANDOM_NUMBER_GENERATOR.nextInt
                    (VALID_SPECIAL_CHARACTERS.length())));
        }
        //Then, generate the amount of numbers and add that to the list.
        for(var j = 0; j < numbers; j++) {
            passwordArrayList.add(VALID_NUMBERS.charAt(RANDOM_NUMBER_GENERATOR.nextInt(VALID_NUMBERS.length())));
        }
        //Then, generate enough letters to get to the minimum length and add them to the list.
        for(var j = 0; j < length - (specialCharacters + numbers); j++) {
            passwordArrayList.add(VALID_LETTERS.charAt(RANDOM_NUMBER_GENERATOR.nextInt(VALID_LETTERS.length())));
        }
        //Then, use PasswordGen.shufflePass() to shuffle the password.
        //Finally, return the scrambled password.
        return PasswordGen.shufflePassword(passwordArrayList);
    }

    public static String shufflePassword(List<Character> arrayOfCharacters) {
        //First, create a string. We'll call it passwordString.
        var passwordString = new StringBuilder(arrayOfCharacters.size());
        //While the arraylist isn't empty, add a random character to a string, then remove that character.
        while(!arrayOfCharacters.isEmpty()) {
            var selectedIndex = RANDOM_NUMBER_GENERATOR.nextInt(arrayOfCharacters.size());
            passwordString.append(arrayOfCharacters.get(selectedIndex));
            arrayOfCharacters.remove(selectedIndex);
        }
        //After the while loop is over, return the scrambled string.
        return passwordString.toString();
    }
}

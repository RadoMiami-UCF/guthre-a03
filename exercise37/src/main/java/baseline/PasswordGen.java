package baseline;

import java.util.ArrayList;

final class PasswordGen {
    private PasswordGen() {}

    public static String generatePassword(int minLength, int specialCharacters, int numbers) {
        //First, generate the amount of special characters and add that to a list of characters.
        //Then, generate the amount of numbers and add that to the list.
        //Then, generate enough letters to get to the minimum length and add them to the list.
        //Then, use PasswordGen.shufflePass() to shuffle the password.
        //Finally, return the scrambled password.
        return "";
    }

    private static String shufflePassword(ArrayList<Character> arrayOfCharacters) {
        //Toss the array of characters into a while loop:
        //While the arraylist isn't empty, add a random character to a string, then remove that character.
        //After the while loop is over, return the scrambled string.
        return "";
    }
}

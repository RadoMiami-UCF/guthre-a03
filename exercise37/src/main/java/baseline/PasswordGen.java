package baseline;

final class PasswordGen {
    private PasswordGen() {}

    public static String generatePassword(int minLength, int specialCharacters, int numbers) {
        //First, generate the amount of special characters and add that to a string.
        //Then, generate the amount of numbers and add that to the string.
        //Then, generate enough letters to get to the minimum length and add them to the string.
        //Then, use PasswordGen.shufflePass() to shuffle the password.
        //Finally, return the shuffledString.
        return "";
    }

    private static String shufflePassword(String stringToShuffle) {
        //First, convert the string into a StringBuilder.
        //Then, toss it into a while loop:
        //While the StringBuilder isn't empty, add a random character to a string, then remove that character.
        //After the while loop is over, return the scrambled string.
        return "";
    }
}

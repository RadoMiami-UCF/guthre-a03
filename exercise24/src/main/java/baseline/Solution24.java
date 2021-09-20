/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, ask the user for two strings.
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        //Then, ask for each individual string and store them.
        var a = sayThenGetString("Enter the first string: ");
        var b = sayThenGetString("Enter the second string: ");
        //Then, flip all the characters in one of the strings.
        //If the strings match, say that they're anagrams. Otherwise, say that they aren't.
        //Covered by IsAnagram.
        if(IsAnagram.isAnagram(a, b)) {
            System.out.print("\"" + a + "\" and \"" + b + "\" are anagrams.");
        } else {
            System.out.print("\"" + a + "\" and \"" + b + "\" are not anagrams.");
        }
    }

    private static String sayThenGetString(String sayString) {
        System.out.print(sayString);
        return in.nextLine();
    }
}

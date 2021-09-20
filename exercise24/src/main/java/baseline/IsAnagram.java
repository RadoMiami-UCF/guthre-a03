/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.jetbrains.annotations.NotNull;

final class IsAnagram {
    //Specifically using package access since that's all that's necessary here.
    private IsAnagram() {

    }

    public static boolean isAnagram(@NotNull String a, @NotNull String b) {
        //Take in two strings.
        //First, invert the characters of one of them.
        var reverser = new StringBuilder(b.length());
        reverser.append(b);
        reverser.reverse();
        var reversedB = reverser.toString();
        //Then, compare them.
        //If they're the same, return true.
        return a.equals(reversedB);
        //Otherwise, return false.
    }
}

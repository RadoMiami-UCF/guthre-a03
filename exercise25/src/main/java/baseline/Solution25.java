/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution25 {
    /*
    Howdy! Funny story, I was in the middle of working on Solution25 while in class when I heard that you had to
    make one commit for the pseudocode, then another for the actual assignment, with the restriction going into effect
    that same day BEFORE I started working on it. So I essentially had to rollback everything to right before I wrote
    any code (other than defining the in Scanner, since I already knew that I would need that, no matter the project.
    Anyway, I would give you a cookie or two for listening to my banter, but I'm pretty sure emojis don't work in here.
    🍪 Huh! Turns out they do! 🍪
     */
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, take in and store a password.
        //Then, check for the following criteria:
        //If the password is only numbers and is fewer than 8 characters, it is of strength 1.
        //If the password is only letters and is fewer than 8 characters, it is of strength 2.
        //If the password is letters and numbers and is at least 8 characters, it is of strength 3.
        //If the password is letters, numbers and special characters and is at least 8 characters, it is of strength 4.
        //If none of these are satisfied, it is of strength 0.
        //0 = unknown, 1 = very weak, 2 = weak, 3 = strong, 4 = very strong.
    }
}

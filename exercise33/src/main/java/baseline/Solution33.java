/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    public static void main(String[] args) {
        //Then, ask for a question. (Probably don't have to do anything with it.)
        System.out.print("What's your question?\n> ");
        in.nextLine();
        //Then, use an object of type Random to get a number from 0-3. We'll call this number randNum.
        var randomNumberGenerator = new Random();
        //Finally, print the string that comes from Magic8Ball.get8BallString(randNum).
        System.out.print("\n" + Magic8Ball.get8BallString(
                randomNumberGenerator.nextInt(Magic8Ball.MAGIC_8_BALL_MAP_LENGTH)));
    }
}

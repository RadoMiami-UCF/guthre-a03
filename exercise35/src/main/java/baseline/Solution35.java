/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

public class Solution35 {
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //Can't write any test cases here for the same reason as last time: too simple/something that can't easily
        //be tested.
        //First, create an empty arraylist.
        ArrayList<String> entrantList = new ArrayList<>();

        //Then, begin a loop that only ends when the in.nextLine() returns empty.
        while(true) {
            //In that loop, ask for a name, then store it in the array list.
            System.out.print("Enter a name: ");
            var nextName = in.nextLine();
            if("".equals(nextName)) {
                break;
            } else {
                entrantList.add(nextName);
            }
        }

        //After the loop, trim the arraylist's size.
        entrantList.trimToSize();

        //Using this simple program as an excuse to learn how to exception handle properly.
        //Note: using loggers wasn't as bad as I thought! Why wasn't I always doing this?
        try {
            //Then, use an object of type Random to get a random number between 0 and the size of the array - 1 and say
            //that the string at that index in the arraylist is the winner.
            var randomNumberGenerator = new Random();
            //Then, say that the string at that index in the arraylist is the winner.
            System.out.print("The winner is... " + entrantList.get(randomNumberGenerator.nextInt(entrantList.size()))
                    + ".");
        } catch (IllegalArgumentException exception) {
            var logger = Logger.getLogger("logger");
            logger.log(WARNING, "No names were entered", exception);
            System.out.print("You must enter at least one name!");
        }
    }
}

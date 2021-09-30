/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

public class Solution35 {
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //Can't write any test cases here for the same reason as last time: too simple/something that can't easily
        //be tested.
        //First, create an empty arraylist.
        ArrayList<String> entrantList = new ArrayList<>();

        /*
        Then, begin a loop that only ends when the in.nextLine() returns empty.
        I could have compressed this into a single while line, but apparently I have to follow a "style guide" or
        something lame like that.
         */
        while(true) {
            if (!hasNewName(entrantList)) {
                break;
            }
        }

        //After the loop, trim the arraylist's size.
        entrantList.trimToSize();

        //Finally, call pickRandomName to pick and say a random name.
        var randomNumberGenerator = new Random();
        pickRandomName(entrantList, randomNumberGenerator);
    }

    public static boolean hasNewName(Collection<String> stringArrayList) {
        System.out.print("Enter a name: ");
        var nextName = in.nextLine();
        if("".equals(nextName)) {
            return false;
        } else {
            stringArrayList.add(nextName);
            return true;
        }
    }

    public static void pickRandomName(List<String> nameList, Random randomNumberGenerator) {
        //Using this simple program as an excuse to learn how to exception handle properly.
        //Note: using loggers wasn't as bad as I thought! Why wasn't I always doing this?

        try {
            /*
            Use an object of type Random to get a random number between 0 and the size of the array - 1 and say
            that the string at that index in the arraylist is the winner.
             */
            //Then, say that the string at that index in the arraylist is the winner.
            System.out.print("The winner is... " + nameList.get(randomNumberGenerator.nextInt(nameList.size()))
                    + ".");
        } catch (IllegalArgumentException exception) {
            var logger = Logger.getLogger("logger");
            logger.log(WARNING, "No names were entered", exception);
            System.out.print("You must enter at least one name!");
        }
    }
}

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution32 {
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, greet the user with the game, then ask for the difficulty level.
        //Then, create an instance of GameLoopObject with said difficulty level.
        var gameLoopObject = new GameLoopObject(safeSayThenGetDiff());

        while(true) {
            //Then, run a game loop.
            gameLoopObject.gameLoop();
            //After the game loop, ask if the user wants to play again.
            if(!askThenGetPlayAgain()) {
                break;
            }
            //If they do, ask for another difficulty and repeat the cycle.
            gameLoopObject.setDifficulty(safeSayThenGetDiff());
        }
        //If they don't, end the program.
    }

    //Hippity hoppity, my previous code is still my property.
    private static boolean askThenGetPlayAgain() {
        System.out.print("Do you wish to play again (Y/N)? ");
        return Character.toUpperCase(in.next().charAt(0)) == 'Y';
    }

    private static int safeSayThenGetDiff() {
        System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
        var gotInt = false;
        var getInt = 0;
        while(!gotInt) {
            try {
                getInt = Integer.parseInt(in.nextLine());
                gotInt = true;
            } catch (NumberFormatException ignored) {/*Not doing anything if there's an exception*/}
        }
        return getInt;
    }
}

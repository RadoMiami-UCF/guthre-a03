/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        //First, greet the user with the game, then ask for the difficulty level.
        var wantToPlay = true;
        //Then, create an instance of GameLoopObject with said difficulty level.
        var gameLoopObject = new GameLoopObject();

        while(wantToPlay) {
            gameLoopObject.SetDifficulty(in.nextLine());
            //Then, run a game loop.
            gameLoopObject.gameLoop();
            //After the game loop, ask if the user wants to play again.
            wantToPlay = askThenGetYNBool("Do you wish to play again (Y/N)? ");
            //If they do, ask for another difficulty and repeat the cycle.
        }
        //If they don't, end the program.
    }

    //Hippity hoppity, my previous code is still my property.
    private static boolean askThenGetYNBool(String sayString) {
        System.out.print(sayString);
        return Character.toUpperCase(in.next().charAt(0)) == 'Y';
    }
}

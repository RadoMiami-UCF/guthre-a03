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
            //Then, run a game loop.
            gameLoopObject.gameLoop();
            //After the game loop, ask if the user wants to play again.
            //If they do, ask for another difficulty and repeat the cycle.
        }
        //If they don't, end the program.
    }
}

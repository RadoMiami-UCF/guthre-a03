/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.Random;
import java.util.regex.Pattern;

final class GameLoopObject {
    private static final int MAX_NUMBER_EASY = 10;
    private static final int MAX_NUMBER_MEDIUM = 100;
    private static final int MAX_NUMBER_HARD = 1000;
    private static final int EASY_DIFFICULTY_VALUE = 1;
    private static final int NORMAL_DIFFICULTY_VALUE = 2;
    private static final int HARD_DIFFICULTY_VALUE = 3;
    private int currentMaxNumber = MAX_NUMBER_EASY;
    private final Random randomNumberGenerator = new Random();

    public GameLoopObject(int initDifficulty) {
        setDifficulty(initDifficulty);
    }

    public void setDifficulty(int difficulty) {
        //Set this object's difficulty to the given difficulty.
        this.currentMaxNumber = switch (difficulty) {
            case EASY_DIFFICULTY_VALUE -> MAX_NUMBER_EASY;
            case NORMAL_DIFFICULTY_VALUE -> MAX_NUMBER_MEDIUM;
            case HARD_DIFFICULTY_VALUE -> MAX_NUMBER_HARD;
            default -> throw new IllegalStateException("Unexpected value: " + difficulty);
        };
    }

    public void gameLoop() {
        //First, create a random private number from 1 to the maximum number of the difficulty.
        int correctNum = randomNumberGenerator.nextInt(this.currentMaxNumber) + 1;
        //Then, say that the number has been created and ask for the first guess.
        System.out.print("I have my number. What's your guess? ");
        //Then, run stringChecker.
        for(var j = 1; true; j++) {
            if(stringChecker(correctNum, Solution32.in.nextLine())) {
                //If the player got it right, say that they got it right in x guesses and break the loop.
                System.out.println("You got it in " + j + " guesses!\n");
                break;
            } else {
                //Otherwise, ask for another number.
                System.out.print("Guess again: ");
            }
        }
    }

    public static boolean stringChecker(int correctNum, String inGuess) {
        if(!Pattern.matches("\\d+", inGuess)) {
            //If the player inputted an invalid string, say that they inputted something that wasn't a number and return
            //false.
            System.out.print("That wasn't a number. ");
            return false;
        } else {
            return stringCheckerNum(correctNum, Integer.parseInt(inGuess));
        }
    }

    private static boolean stringCheckerNum(int correctNum, int inGuess) {
        if(inGuess > correctNum) {
            //If the player guessed too high, say that they guessed too high and return false.
            System.out.print("Too high. ");
            return false;
        } else if(inGuess < correctNum) {
            //If the player guessed too low, say that they guessed too low and return false.
            System.out.print("Too low. ");
            return false;
        } else {
            //If the player got it right, return true.
            return true;
        }
    }
}

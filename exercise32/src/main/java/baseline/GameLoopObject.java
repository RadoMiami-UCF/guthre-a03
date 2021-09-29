package baseline;

final class GameLoopObject {
    private static final int MAX_NUMBER_EASY = 10;
    private static final int MAX_NUMBER_MEDIUM = 100;
    private static final int MAX_NUMBER_HARD = 1000;
    private int difficulty;

    public void SetDifficulty(int difficulty) {
        //Set this object's difficulty to the given difficulty.
        this.difficulty = difficulty;
    }

    public void gameLoop() {
        //First, create a random private number from 1 to the maximum number of the difficulty.
        //Then, say that the number has been created and ask for the first guess.
        //Then, run gameLoopInstance.
        //If the player got it right, say that they got it right in x guesses and break the loop.
        //If the player didn't get it right, say that they guessed too high/too low and ask for another guess.
        //If the player inputted an invalid number, say that they inputted an invalid number and ask for another guess.
    }

    private static byte gameLoopInstance(int correctNum, String inGuess) {
        //If the player was too high, return 0.
        //If the player was too low, return 1.
        //If the player got it right, return 2.
        //If the player made an invalid choice, return 3.
        return 0;
    }
}

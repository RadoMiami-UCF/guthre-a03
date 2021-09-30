/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.util.Map;

final class Magic8Ball {
    //First, use a map to store the numbers 0-3 and assign them to the four different entries in the Magic 8 Ball.
    private static final Map<Integer, String> eightBallMap = Map.of(0, "Yes.", 1, "No.",
            2, "Maybe.", 3, "Ask again later.");
    public static final int MAGIC_8_BALL_MAP_LENGTH = eightBallMap.size();

    private Magic8Ball() {}

    public static String get8BallString(int randNum) {
        //Reply with the string that corresponds with that number through the map.
        return eightBallMap.get(randNum);
    }
}

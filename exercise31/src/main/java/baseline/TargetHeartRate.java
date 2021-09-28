/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

final class TargetHeartRate {
    private static final int MAX_HEART_RATE = 220;

    private TargetHeartRate() {}

    public static int calcHeartRate(int age, int restingHeartRate, double intensity) {
        return (int) ((((MAX_HEART_RATE - age) - restingHeartRate) * intensity) + restingHeartRate);
    }
}

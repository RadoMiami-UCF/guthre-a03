/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final double LOWEST_INTENSITY = 0.55;
    private static final double INTENSITY_INCREASE_BY = 0.05;
    private static final int DOUBLE_TO_PERCENT = 100;
    private static final DecimalFormat percentFormat = new DecimalFormat("0.##");

    public static void main(String[] args) {
        //First, ask for and store the resting pulse. Then, ask for and store the age.
        var restingPulse = sayThenGetInt("Resting Pulse: ");
        var age = sayThenGetInt("Age: ");

        //Then, start building the chart.
        System.out.println("\nIntensity    | Rate\n-------------|--------");

        //Use the TargetHeartRate formula to get the target rate for each intensity.
        for(var j = LOWEST_INTENSITY; j < 1; j += INTENSITY_INCREASE_BY) {
            //After each use of the TargetHeartRate formula, print the intensity (every 5% from 55% to 95%) and the
            //heart rate.
            System.out.println(percentFormat.format(j * DOUBLE_TO_PERCENT) + "%          | "
                    + TargetHeartRate.calcHeartRate(age, restingPulse, j) + " bpm");
        }
    }

    private static int sayThenGetInt(String sayString) {
        System.out.print(sayString);
        return in.nextInt();
    }
}

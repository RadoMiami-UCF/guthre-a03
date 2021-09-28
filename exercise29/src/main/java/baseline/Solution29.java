/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

public class Solution29 {
    private static final int INVESTMENT_DOUBLE_NUMERATOR = 72;
    public static void main(String[] args) {
        //First, ask for a rate of return through ReturnValidator.badInputChecker().
        //Then, divide 72 by that rate of return to get the approximate amount of years to double your investment.
        //Finally, return that amount of years (rounded up).
        //Turns out that can all be combined into a single statement!
        System.out.print("It will take "
                + (int) Math.ceil(INVESTMENT_DOUBLE_NUMERATOR / ReturnValidator.badInputChecker())
                + " years to double your initial investment.");
    }
}

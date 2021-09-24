/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Solution26 {


    //Then, return the amount of months it will take to pay off the card.
    private static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);
    private static final int PRECISION_TO_ROUND_TO = 2;
    private static final int DOUBLE_TO_PERCENT_DIVISOR = 100;

    public static void main(String[] args) {
        //First, ask for, round to the highest cent, and store the balance.
        var balance = MoneyRound.roundToXPlaces(sayThenGetDouble("What is your balance? "),
                PRECISION_TO_ROUND_TO);
        //Then, do the same with the APR and monthly payment. (Divided APR when first gotten)
        var apr = sayThenGetDouble("What is the APR on the card (as a percent)? ") / DOUBLE_TO_PERCENT_DIVISOR;
        var monthlyPayment = MoneyRound.roundToXPlaces(
                sayThenGetDouble("What is the monthly payment you can make? "), PRECISION_TO_ROUND_TO);
        System.out.print("\n");
        //Newline here for better text formatting.
        //Then, call calculateMonthsUntilPaidOff from the PaymentCalculator class.
        var payCalc = new PaymentCalculator(apr, balance, monthlyPayment);
        var monthsUntilPaidOff = payCalc.calculateMonthsUntilPaidOff();
        //Finally, return the amount of months until the card is paid off.
        System.out.println("It will take you " + monthsUntilPaidOff + " months to pay off this card.");


    }

    private static double sayThenGetDouble(String sayString) {
        System.out.print(sayString);
        return in.nextDouble();
    }
}

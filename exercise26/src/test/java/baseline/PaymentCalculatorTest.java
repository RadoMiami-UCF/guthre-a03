/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Kimari Guthre
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void testCalculateMonthsUntilPaidOff() {
        var payCalc = new PaymentCalculator(.12, 5000, 100);
        assertEquals(70, payCalc.calculateMonthsUntilPaidOff(),
                "Error calculating months");
        payCalc = new PaymentCalculator(0.00001, 1, 99999);
        assertEquals(1, payCalc.calculateMonthsUntilPaidOff(),
                "Error rounding");
        payCalc = new PaymentCalculator(0.00001, 1, 0);
        assertEquals(101, payCalc.calculateMonthsUntilPaidOff(),
                "Proper handling of silly monthlyPaymentIn values failed");
        payCalc = new PaymentCalculator(0, 1, 1);
        assertEquals(1, payCalc.calculateMonthsUntilPaidOff(), "0 APR cards not handled properly");
    }
}
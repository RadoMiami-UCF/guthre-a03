package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyRoundTest {

    @Test
    void testRoundToXPlaces() {
        /*
        Question: Why did I want roundToXPlaces to be so robust? It's not like I'm going to use it at anything but
        precision 2.
        Answer: It was probably because I could reuse this code if I ever needed to round a number to a certain decimal
        precision.
        */
        assertEquals(1.24, MoneyRound.roundToXPlaces(1.2345, 2),
                0.00001, "Error rounding 1.2345 to 1.24");
        assertEquals(10000000000000000.13, MoneyRound.roundToXPlaces(10000000000000000.1234, 2),
                0.001, "Error rounding very big numbers");
        assertEquals(0.01, MoneyRound.roundToXPlaces(0.00001, 2), 0.001,
                "Error rounding very small numbers");
        assertEquals(1.2346, MoneyRound.roundToXPlaces(1.23456789, 4), 0.00001,
                "Error rounding at precision 4");
        assertEquals(12350, MoneyRound.roundToXPlaces(12345, -1), 0.1,
                "Error rounding negative precisions");
    }
}
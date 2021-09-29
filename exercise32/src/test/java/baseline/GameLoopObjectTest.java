package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLoopObjectTest {

    @Test
    void testStringCheckerTooHigh() {
        assertFalse(GameLoopObject.stringChecker(100, "200"),
                "Cannot identify cases where input number is too high");
    }

    @Test
    void testStringCheckerTooLow() {
        assertFalse(GameLoopObject.stringChecker(100, "50"),
                "Cannot identify cases where input number is too low");
    }

    @Test
    void testStringCheckerCorrect() {
        assertTrue(GameLoopObject.stringChecker(100, "100"),
                "Cannot identify cases where input number is correct");
    }

    @Test
    void testStringCheckerInvalid() {
        assertFalse(GameLoopObject.stringChecker(100, "French fries"),
                "Cannot identify cases where input number is invalid");
    }
}
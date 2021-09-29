package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLoopObjectTest {

    @Test
    void testStringCheckerTooHigh() {
        assertEquals(0, GameLoopObject.stringChecker(100, "200"),
                "Cannot identify cases where input number is too high");
    }

    @Test
    void testStringCheckerTooLow() {
        assertEquals(1, GameLoopObject.stringChecker(100, "50"),
                "Cannot identify cases where input number is too low");
    }

    @Test
    void testStringCheckerCorrect() {
        assertEquals(2, GameLoopObject.stringChecker(100, "100"),
                "Cannot identify cases where input number is correct");
    }

    @Test
    void testStringCheckerInvalid() {
        assertEquals(3, GameLoopObject.stringChecker(100, "French fries"),
                "Cannot identify cases where input number is invalid");
    }

    @Test
    void testStringCheckerInvalidNum() {
        assertEquals(4, GameLoopObject.stringChecker(100, "-42"),
                "Cannot identify cases where input number is too low");
    }
}
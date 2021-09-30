package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void testGet8BallString() {
        assertEquals("Yes.", Magic8Ball.get8BallString(0), "Map does not work #1");
        assertEquals("No.", Magic8Ball.get8BallString(1), "Map does not work #2");
        assertEquals("Maybe.", Magic8Ball.get8BallString(2), "Map does not work #3");
        assertEquals("Ask again later.", Magic8Ball.get8BallString(3), "Map does not work #4");
    }
}
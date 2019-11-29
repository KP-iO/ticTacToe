import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void testHasABoard() {
        Board board = new Board();
        assertEquals("This is board.", board.getBoard());
    }
}
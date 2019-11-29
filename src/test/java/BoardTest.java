import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void hasABoard() {
        Board board = new Board();
        assertEquals("This is board.", board.getBoard());
    }

    @Test
    public void boardIsEmpty() {
        Board board = new Board();
        assertEquals(false, board.isEmpty());
    }
}
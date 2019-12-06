import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    @Test
    public void hasABoard() {
        Board board = new Board();
        List currentGrid = board.getBoard();
        assertEquals(9, currentGrid.size());
    }

    @Test
    public void boardIsEmpty() {
        Board board = new Board();
        assertEquals(false, board.isEmpty());
    }

    @Test
    public void marksTheBoard() {
        Board board = new Board();
        board.markBoard("X", 1);
        assertEquals("X", board.getMarkAtPosition(1));
    }
}
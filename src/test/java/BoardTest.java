import org.junit.Test;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

public class BoardTest {
    private String playerOneMark = "X";
    private String playerTwoMark = "O";
    private Board board;

    @Before
    public void setUp() {
        board = new Board(playerOneMark, playerTwoMark);
    }

    @Test
    public void hasABoard() {
        List currentGrid = board.getBoard();

        assertEquals(9, currentGrid.size());
    }

    @Test
    public void boardIsEmpty() {
        assertEquals(false, board.isEmpty());
    }

    @Test
    public void marksTheBoard() {
        board.markBoard(playerOneMark, 1);

        assertEquals(playerOneMark, board.getMarkAtPosition(1));
    }

    @Test
    public void knowsIfAPositionIsValid() {
        board.markBoard(playerOneMark, 1);
        System.out.println(board.getBoard());

        assertFalse(board.isValidPosition(1));
    }
}
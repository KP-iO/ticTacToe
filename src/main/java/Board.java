import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private String playerOne;
    private String playerTwo;
    private List<String> grid = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));

    public Board(String playerOne, String playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public boolean isEmpty() {
        return grid.contains(playerOne) && grid.contains(playerTwo);
    }

    public List getBoard() {
        return grid;
    }

    public void markBoard(String mark, int position) {
        grid.set(position - 1, mark);
    }

    public String getMarkAtPosition(int position) {
        return grid.get(position - 1);
    }

    public boolean isValidPosition(int position) {
        String mark = getMarkAtPosition(position);
        return mark != playerOne && mark != playerTwo;
    }
}

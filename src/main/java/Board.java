import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private List<String> grid = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9"));

    public boolean isEmpty() {
        return grid.contains("X") && grid.contains("0");
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




}

package comp1206;

public class GameBoard {
    int size;
    String[][] board;
    String currentPlayer = "X";

    public GameBoard(int size) {
        this.size = size;
        board = new String[size][size];
    }

    public void resetBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = "";
            }
        }
    }

    public void switchPlayer() {
        if (currentPlayer.equals("X")) {
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }
}

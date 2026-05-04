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

    public void makeMove(int row, int col) {
        if (board[row][col].equals("")) {
            board[row][col] = currentPlayer;
        }
    }

    public String checkWinner() {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("")) {
                return board[i][0];
            }
            else if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("")) {
                return board[0][i];
            }
        }
        // Diagonals
        if (!board[0][0].equals("") &&
                board[0][0].equals(board[1][1]) &&
                board[1][1].equals(board[2][2])) {

            return board[0][0];
        }
        if (!board[0][2].equals("") &&
                board[0][2].equals(board[1][1]) &&
                board[1][1].equals(board[2][0])) {

            return board[0][2];
        }

        return "";
    }
}

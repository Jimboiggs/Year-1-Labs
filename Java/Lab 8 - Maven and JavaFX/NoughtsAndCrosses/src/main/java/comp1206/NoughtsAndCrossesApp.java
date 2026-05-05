package comp1206;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NoughtsAndCrossesApp extends Application {
    private GameBoard board = new GameBoard(3);
    private Button[][] buttons = new Button[3][3];

    @Override
    public void start(Stage stage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.setMinSize(160, 160);
                buttons[row][col] = button;
                int finalRow = row;
                int finalCol = col;
                gridPane.add(button, col, row);
                button.setOnAction(e -> handleMove(button, finalRow, finalCol));
            }
        }
        stage.setScene(new Scene(gridPane));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void handleMove(Button button, int row, int col) {
        if (board.makeMove(row, col)) {
            button.setText(board.currentPlayer);
            button.setDisable(true);
            String winner = board.checkWinner();
            if (!winner.equals("")) {
                System.out.println(winner + " wins!");
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        buttons[r][c].setDisable(true);
                    }
                }
            } else {
                board.switchPlayer();
            }
        }
    }
}

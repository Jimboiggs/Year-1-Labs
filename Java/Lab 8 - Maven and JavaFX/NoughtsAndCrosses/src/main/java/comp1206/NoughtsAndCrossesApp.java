package comp1206;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class NoughtsAndCrossesApp extends Application {
    private GameBoard board = new GameBoard(3);
    private Button[][] buttons;
    private Stage stage;
    private Label info = new Label();

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setScene(getStartScene(stage));
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
                stage.setScene(getEndScreen(stage, winner));
                for (int r = 0; r < board.getSize(); r++) {
                    for (int c = 0; c < board.getSize(); c++) {
                        buttons[r][c].setDisable(true);
                    }
                }
            }
            if (board.isFull() && winner.equals("")) {
                stage.setScene(getEndScreen(stage, "Draw"));
            }
            board.switchPlayer();
            info.setText("Turn: " + board.currentPlayer);
        }
    }

    public Scene getGameScene(Stage stage, String xName, String oName) {
        buttons = new Button[board.getSize()][board.getSize()];
        info.setText("Turn: " + board.currentPlayer);
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                Button button = new Button("");
                button.setMinSize(160, 160);
                buttons[row][col] = button;
                int finalRow = row;
                int finalCol = col;
                gridPane.add(button, col, row);
                button.setOnAction(e -> handleMove(button, finalRow, finalCol));
            }
        }
        VBox root = new VBox(info, gridPane);
        return new Scene(root);
    }

    public Scene getStartScene(Stage stage) {
        TextField XName = new TextField("X name");
        TextField OName = new TextField("O name");
        TextField size = new TextField("Grid size (int)");
        Button startButton = new Button("Start");
        startButton.setOnAction(e -> {
            String xName = XName.getText();
            String oName = OName.getText();
            int gridSize = Integer.parseInt(size.getText());
            board = new GameBoard(gridSize);
            stage.setScene(getGameScene(stage, xName, oName));
        });
        startButton.setDisable(true);
        XName.textProperty().addListener((obs, oldVal, newVal) ->
                startButton.setDisable(XName.getText().isEmpty() || OName.getText().isEmpty())
        );

        OName.textProperty().addListener((obs, oldVal, newVal) ->
                startButton.setDisable(XName.getText().isEmpty() || OName.getText().isEmpty())
        );
        VBox vbox = new VBox(XName, OName, size, startButton);
        return new Scene(vbox);
    }

    public Scene getEndScreen(Stage stage, String winner) {
        Label winnerText = new Label();
        if (winner.equals("Draw")) {
            winnerText.setText("Draw!");
        } else {
            winnerText.setText(winner + " wins!");
        }
        Button OKButton = new Button();
        OKButton.setText("OK");
        OKButton.setOnAction(e-> {
            board.resetBoard();
            stage.setScene(getStartScene(stage));
        });
        VBox root = new VBox(winnerText, OKButton);
        return new Scene(root);
    }
}

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
    private String xName;
    private String oName;
    private int xWins = 0;
    private int oWins = 0;
    private int draws = 0;

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
                if (winner.equals("X")) {
                    xWins++;
                } else {
                    oWins++;
                }
            }
            if (board.isFull() && winner.equals("")) {
                stage.setScene(getEndScreen(stage, "Draw"));
                draws++;
            }
            board.switchPlayer();
            String currentName;
            if (board.currentPlayer.equals("X")) {
                currentName = xName;
            } else {
                currentName = oName;
            }
            info.setText("Turn: " + currentName);
        }
    }

    public Scene getGameScene(Stage stage, String xName, String oName) {
        buttons = new Button[board.getSize()][board.getSize()];
        String currentName;
        if (board.currentPlayer.equals("X")) {
            currentName = xName;
        } else {
            currentName = oName;
        }
        info.setText("Turn: " + currentName);
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                Button button = new Button("");
                button.setMinSize(140, 140);
                buttons[row][col] = button;
                int finalRow = row;
                int finalCol = col;
                gridPane.add(button, col, row);
                button.setOnAction(e -> handleMove(button, finalRow, finalCol));
            }
        }
        Button scoreButton = new Button("Show Scores");
        scoreButton.setOnAction(e -> showScoreWindow());
        VBox root = new VBox(info, gridPane, scoreButton);
        return new Scene(root);
    }

    public Scene getStartScene(Stage stage) {
        Label xField = new Label("X name:");
        TextField XName = new TextField("");
        Label oField = new Label("O name:");
        TextField OName = new TextField("");
        Label sizeField = new Label("Size (int):");
        TextField size = new TextField("");
        Button startButton = new Button("Start");
        startButton.setOnAction(e -> {
            this.xName = XName.getText();
            this.oName = OName.getText();
            String input = size.getText();
            if (!input.isEmpty())
            {
                int gridSize = Integer.parseInt(input);
                board = new GameBoard(gridSize);
            } else {
                board = new GameBoard(3);
            }
            stage.setScene(getGameScene(stage, xName, oName));
        });
        startButton.setDisable(true);
        XName.textProperty().addListener((obs, oldVal, newVal) ->
                startButton.setDisable(XName.getText().isEmpty() || OName.getText().isEmpty())
        );

        OName.textProperty().addListener((obs, oldVal, newVal) ->
                startButton.setDisable(XName.getText().isEmpty() || OName.getText().isEmpty())
        );
        VBox vbox = new VBox(xField, XName, oField, OName, sizeField, size, startButton);
        return new Scene(vbox, 500, 170);
    }

    public Scene getEndScreen(Stage stage, String winner) {
        Label winnerText = new Label();
        if (winner.equals("Draw")) {
            winnerText.setText("Draw!");
        } else {
            String winnerName;
            if (winner.equals("X")) {
                winnerName = xName;
            } else {
                winnerName = oName;
            }
            winnerText.setText(winnerName + " wins!");
        }
        Button OKButton = new Button("OK");
        OKButton.setOnAction(e -> {
            board.resetBoard();
            stage.setScene(getStartScene(stage));
        });
        VBox root = new VBox(10, winnerText, OKButton);
        return new Scene(root);
    }

    public void showScoreWindow() {
        Stage scoreStage = new Stage();
        Label scores = new Label("X wins: " + xWins + "\n" + "O wins: " + oWins + "\n" + "Draws: " + draws);
        VBox root = new VBox(10, scores);
        Scene scene = new Scene(root, 500, 500);
        scoreStage.setTitle("Scoreboard");
        scoreStage.setScene(scene);
        scoreStage.show();
    }
}

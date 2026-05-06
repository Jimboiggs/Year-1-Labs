package comp1206;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class App extends Application {
    private Button[][] buttons = new Button[3][3];
    private ButtonClickHandler clickHandler = new ButtonClickHandler();
    int playerTurn = 1;
    Label statusLabel;
    int xWins = 0;
    int oWins = 0;
    int draws = 0;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Noughts and Crosses");

        Label statusLabel = new Label("Game in progress. X wins = " + xWins + ". Y wins = " + oWins + ". Draws = " + draws);

        // Reset button
        Button resetButton = new Button();
        resetButton.setText("Reset");
        resetButton.setOnAction(e -> {
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    buttons[r][c].setDisable(false);
                    buttons[r][c].setText("");
                    statusLabel.setText("Game in progress. X wins = " + xWins + ". Y wins = " + oWins + ". Draws = " + draws);
                    playerTurn = 1;
                }
            }
        });

        // Grid pane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                Button button = new Button("");
                button.setMinSize(160, 160);
                buttons[row][col] = button;
                gridPane.add(button, col, row);
            }
        }
        clickHandler.setActions();
        VBox root = new VBox(10);
        root.getChildren().addAll(resetButton, gridPane, statusLabel);
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    class ButtonClickHandler {

        private void setActions() {
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    Button button = buttons[row][col];

                    button.setOnAction(e -> {

                        if (playerTurn == 1) {
                            button.setText("X");
                            playerTurn = 2;
                        } else {
                            button.setText("O");
                            playerTurn = 1;
                        }

                        button.setDisable(true);

                        String winner = checkWinner();
                        if (winner != null) {
                            if (winner == "X") {
                                xWins += 1;
                            } else {
                                oWins += 1;
                            }
                            statusLabel.setText(winner + " Wins!");
                            for (int r = 0; r < 3; r++) {
                                for (int c = 0; c < 3; c++) {
                                    buttons[r][c].setDisable(true);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private String checkWinner() {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(buttons[i][1].getText()) && buttons[i][1].getText().equals(buttons[i][2].getText()) && !buttons[i][0].getText().equals("")) {
                return buttons[i][0].getText();
            }
            else if (buttons[0][i].getText().equals(buttons[1][i].getText()) && buttons[1][i].getText().equals(buttons[2][i].getText()) && !buttons[0][i].getText().equals("")) {
                return buttons[0][i].getText();
            }
        }
        // Diagonals
        if (!buttons[0][0].getText().equals("") &&
                buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText())) {

            return buttons[0][0].getText();
        }
        if (!buttons[0][2].getText().equals("") &&
                buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText())) {

            return buttons[0][2].getText();
        }

        return null;
    }
}

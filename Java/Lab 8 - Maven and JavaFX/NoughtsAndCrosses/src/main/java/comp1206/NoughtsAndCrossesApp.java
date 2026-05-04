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
                gridPane.add(button, col, row);
            }
        }
        stage.setScene(new Scene(gridPane));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

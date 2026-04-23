package comp1206;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class App extends Application {
    private Button[][] buttons = new Button[3][3];

    @Override
    public void start(Stage stage) {
        stage.setTitle("Noughts and Crosses");
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

        stage.setScene(new Scene(gridPane));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

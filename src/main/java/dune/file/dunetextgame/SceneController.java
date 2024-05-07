package dune.file.dunetextgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController {
    @FXML
    private Label welcomeText;

    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
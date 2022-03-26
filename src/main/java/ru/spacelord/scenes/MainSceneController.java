package ru.spacelord.scenes;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class MainSceneController {

    @FXML
    private Button mainButton;

    @FXML
    private void buttonClicked() {
        mainButton.setText("Ha-ha, loser!");
    }
}

package ru.spacelord;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import ru.spacelord.scenes.MainSceneController;

import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello world!");
        stage.setWidth(800);
        stage.setHeight(600);
        FXMLLoader loader = new FXMLLoader();
        URL xmlURL = getClass().getResource("/mainScene.fxml");
        loader.setLocation(xmlURL);
        MainSceneController controller = loader.getController();
        Parent root = loader.load();
        stage.setScene(new Scene(root));

        stage.show();
    }
}

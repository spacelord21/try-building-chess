package ru.spacelord.scenes;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ChessBoard {
    public void createChessBoard() {
        VBox vBox = new VBox();
        for(int i = 0; i < 8; i++) {
            if(i%2==0) {
                VBox vBox1 = new VBox();
                vBox1.setId("a" + (i+1));
                vBox1.prefHeight(64);
                vBox1.prefWidth(64);
                vBox1.setStyle("-fx-background-color:black");
            }
            else {

            }

        }
    }
}

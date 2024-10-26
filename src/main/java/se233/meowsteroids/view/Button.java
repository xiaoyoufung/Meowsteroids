package se233.meowsteroids.view;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class Button extends BorderPane {
    BorderPane buttonArea;
    Label butttonLbl;

    public Button(String text){
        buttonArea = new BorderPane();
        buttonArea.setCenter(butttonLbl);

        butttonLbl = new Label(text);
        butttonLbl.setStyle("-fx-font-size: 55");

        buttonArea.getChildren().add(butttonLbl);
        buttonArea.getStyleClass().add("button");
        getChildren().add(buttonArea);
    }
}

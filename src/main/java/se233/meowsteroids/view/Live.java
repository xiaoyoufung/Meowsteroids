package se233.meowsteroids.view;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Live extends Pane {
    Label live, liveLbl;
    HBox liveArea =  new HBox(10);

    public Live(){
        liveLbl = new Label("Lives: ");
        liveLbl.setStyle("-fx-font-size: 48; -fx-font-weight: 300");

        live = new Label("0");
        live.setStyle("-fx-font-size: 55; -fx-text-fill: red");

        liveArea.getChildren().addAll(liveLbl, live);
        getChildren().add(liveArea);
    }

    public void setLive(int live){
        this.live.setText(Integer.toString(live));
    }
}

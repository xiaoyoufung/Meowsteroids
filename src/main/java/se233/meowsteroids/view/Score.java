package se233.meowsteroids.view;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class Score extends Pane {
    Label point;

    public Score(int x, int y){
        point = new Label("0");
        setTranslateX(x);
        setTranslateY(y);
        point.setStyle("-fx-font-size: 55");
        getChildren().addAll(point);
    }

    public void setPoint(int score){
        this.point.setText(Integer.toString(score));
    }
}

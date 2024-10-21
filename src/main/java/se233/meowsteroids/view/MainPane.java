package se233.meowsteroids.view;

import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainPane extends VBox {
    public MainPane(){}

    private Pane getDetailsPane(){
        Pane mainInfoPane = new AnchorPane();
        HBox topArea = genTopArea();

        mainInfoPane.getChildren().addAll(topArea);
        return mainInfoPane;
    }

    public void drawPane(){
        Pane mainInfoPane = getDetailsPane();
        this.setStyle("-fx-background-color:#FFF;");
        this.getChildren().add(mainInfoPane);
    }

    private HBox genTopArea(){
        HBox topArea = new HBox();
        Label highScoreLbl, scoreLbl;

        highScoreLbl = new Label("Highscore: ");
        highScoreLbl.setStyle("-fx-font-size: 30");

        scoreLbl = new Label("0");

        topArea.getChildren().addAll(highScoreLbl, scoreLbl);
        return topArea;
    }
}

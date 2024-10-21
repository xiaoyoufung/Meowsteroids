package se233.meowsteroids.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class MainPane extends VBox {
    public MainPane(){}

    private Pane getDetailsPane(){
        BorderPane mainInfoPane = new BorderPane();
        Pane topArea = genTopArea();

        //mainInfoPane.getChildren().addAll(topArea);
        mainInfoPane.setTop(topArea);
        mainInfoPane.setPadding(new Insets(0, 60, 0, 60));
        return mainInfoPane;
    }

    public void drawPane(){
        Pane mainInfoPane = getDetailsPane();
        this.setStyle("-fx-background-color:#FFF;");
        this.getChildren().add(mainInfoPane);
    }

    private Pane genTopArea(){
        BorderPane topArea = new BorderPane();
        HBox scoreArea = new HBox(10);

        Label highScoreLbl, scoreLbl;

        highScoreLbl = new Label("Highscore: ");
        highScoreLbl.setStyle("-fx-font-size: 48; -fx-font-weight: 300");

        scoreLbl = new Label("10982");
        scoreLbl.setStyle("-fx-font-size: 55");

        scoreArea.getChildren().addAll(highScoreLbl, scoreLbl);
        scoreArea.setAlignment(Pos.CENTER);

        topArea.setRight(scoreArea);
        return topArea;
    }

    private VBox genMiddleArea(){
        VBox middleArea = new VBox(10);

        return middleArea;
    }
}

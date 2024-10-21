package se233.meowsteroids.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import se233.meowsteroids.Launcher;

public class MainPane extends VBox {
    public MainPane(){}

    private Pane getDetailsPane(){
        BorderPane mainInfoPane = new BorderPane();
        Pane topArea = genTopArea();
        Pane middleArea = genMiddleArea();

        //mainInfoPane.getChildren().addAll(topArea);
        mainInfoPane.setTop(topArea);
        mainInfoPane.setCenter(middleArea);
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

        ImageView catBossImg = new ImageView(new Image((Launcher.class.getResource("assets/images/BossCat.png")).toString()));
        catBossImg.setFitWidth(260);
        catBossImg.setFitHeight(260);

        middleArea.getChildren().addAll(catBossImg);
        return middleArea;
    }
}

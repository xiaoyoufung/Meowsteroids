package se233.meowsteroids.view;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MainPane extends VBox {
    public MainPane(){}

    private Pane getDetailsPane(){
        Pane mainInfoPane = new AnchorPane();

        return mainInfoPane;
    }

    public void drawPane(){
        Pane mainInfoPane = getDetailsPane();
        this.setStyle("-fx-background-color:#FFF;");
        this.getChildren().add(mainInfoPane);
    }
}

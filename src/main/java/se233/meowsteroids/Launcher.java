package se233.meowsteroids;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import se233.meowsteroids.view.MainPane;

public class Launcher extends Application {
    private static MainPane mainPane = null;

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainPane = new MainPane();

        refreshPane();

        Scene scene = new Scene(mainPane, 1000, 600);

        // Apply CSS
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void refreshPane(){
        mainPane.drawPane();
    }
}

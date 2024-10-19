module se233.meowsteroids {
    requires javafx.controls;
    requires javafx.fxml;


    opens se233.meowsteroids to javafx.fxml;
    exports se233.meowsteroids;
}
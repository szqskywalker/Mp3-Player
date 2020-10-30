package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller obj = new Controller();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root,1000,750);
        primaryStage.setScene(scene);
        scene.getStylesheets().add("DesignComponents.css");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

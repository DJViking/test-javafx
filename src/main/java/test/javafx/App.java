package test.javafx;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        App.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();

        stage.setScene(new Scene(root));
        stage.setWidth(200);
        stage.setHeight(200);
        stage.setTitle("Hello JavaFX");
        stage.show();
    }
}

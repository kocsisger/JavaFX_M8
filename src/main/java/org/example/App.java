package org.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.model.Model;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        var loader = new FXMLLoader(getClass().getResource("main.fxml"));
        var scene = new Scene(loader.load());
        ((MainController)loader.getController())
                .setModel(new Model());

        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Student register");
        stage.show();
    }

}

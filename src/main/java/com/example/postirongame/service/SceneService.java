package com.example.postirongame.service;

import com.example.postirongame.Main;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.NoArgsConstructor;

import java.io.IOException;

@NoArgsConstructor
public class SceneService {

    public void switchScene(Event event, String sceneName) throws IOException {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(sceneName));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 400);
        stage.setScene(scene);
    }
}

package com.example.postirongame;

import com.example.postirongame.controller.InitialViewController;
import com.example.postirongame.service.SceneService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("initial-view.fxml"));

        //Services
        SceneService sceneService = new SceneService();
        //Dependency Injection configuration for controllers
        fxmlLoader.setControllerFactory(controllerClass -> {
            try {
                if (controllerClass == InitialViewController.class) {
                    return new InitialViewController(sceneService);
                }
                // others controllers
                return controllerClass.getDeclaredConstructor().newInstance();
            } catch (Exception exc) {
                throw new RuntimeException(exc);
            }
        });

        Scene scene = new Scene(fxmlLoader.load(), 1000, 400);
        stage.setTitle("Post-Iron Game!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class test2 extends Application {
    @Override // Override the start method on the Application class
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();

        // Create and register the handler
        pane.setOnMouseClicked(e -> {
            pane.getChildren().clear();
            pane.getChildren().add(new Text(e.getX(), e.getY(),
                    "(" + e.getX() + ", " + e.getY() + ")"));
        });

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Exercise_15_08a"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}
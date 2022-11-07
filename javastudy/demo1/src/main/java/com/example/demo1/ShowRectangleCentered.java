package com.example.demo1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShowRectangleCentered extends Application {

    public void start(Stage primaryStage) {

        Rectangle r111 = new Rectangle( 60, 30);
        r111.setStroke(Color.BLACK);
        r111.setFill(Color.WHITE);
        Group group = new Group();
        group.getChildren().add(r111);

        Scene scene = new Scene(new BorderPane(group), 250, 150);
        primaryStage.setTitle("ShowRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
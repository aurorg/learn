package com.example.demo1;

import javafx.application.Application;
import javafx.stage.Stage;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class test3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("A");
        StackPane pane = new StackPane(text);

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise15_10");
        primaryStage.show();

        scene.setOnKeyPressed(event -> text.setText(event.getCode() == KeyCode.ENTER ? "" : text.getText() + event.getText()));
    }
}

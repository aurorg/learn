package com.example.demo1;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    public void start(Stage primaryStage) {
        GridPane ppa12 = new GridPane();
        ppa12.setAlignment(Pos.CENTER);
        ppa12.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        ppa12.setHgap(5.5);
        ppa12.setVgap(5.5);
        ppa12.add(new Label("学号:"), 0, 0);
        ppa12.add(new TextField(), 1, 0);
        ppa12.add(new Label("姓名:"), 0, 1);
        ppa12.add(new TextField(), 1, 1);
        ppa12.add(new Label("数学成绩:"), 0, 2);
        ppa12.add(new TextField(), 1, 2);
        Button btAdd1 = new Button("确定");
        Button btAdd2 = new Button("取消");
        ppa12.add(btAdd1, 1, 3);
        GridPane.setHalignment(btAdd1, HPos.LEFT);
        ppa12.add(btAdd2, 1, 3);
        GridPane.setHalignment(btAdd2, HPos.RIGHT);
        Scene scene = new Scene(ppa12);
        primaryStage.setTitle("ShowGridppa12");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
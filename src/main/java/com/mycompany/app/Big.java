/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

/**
 * @author revo
 */
public class Big extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        StackPane sp = new StackPane();
        AnchorPane anchorPane1 = new AnchorPane();
        anchorPane1.getChildren().add(new Label("home"));
        AnchorPane anchorPane2 = new AnchorPane();
        anchorPane2.getChildren().add(new Label("admin"));
        AnchorPane anchorPane3 = new AnchorPane();
        anchorPane3.getChildren().add(new Label("student"));
        List<RevoView> revoViews = Arrays.asList(new RevoView("/home.png", anchorPane1), new RevoView("/admin.jpg", anchorPane2), new RevoView("/student.png", anchorPane3));
        Help help = new Help(revoViews, sp);
        pane.setCenter(sp);
        pane.setBottom(help.getBox());
        Scene s = new Scene(pane);
        ScaleTransition go = help.getGo();
        ScaleTransition back = help.getBack();
        s.setOnMouseMoved((MouseEvent event) -> {
            double r = event.getScreenY() - event.getY();
            if (r < event.getScreenY() / 10) {
                back.stop();
                go.play();
            } else {
                go.stop();
                back.play();
            }

        });

        primaryStage.setTitle("Home");
        primaryStage.setScene(s);
        primaryStage.show();
        primaryStage.setResizable(false);
        primaryStage.setMaximized(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

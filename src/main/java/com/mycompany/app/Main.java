/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author revo
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group g = new Group();
        Scene s = new Scene(g, 300, 300,Color.BEIGE);
        primaryStage.setTitle("welcome");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

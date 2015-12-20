/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import com.sun.javafx.geom.Line2D;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author revo
 */
public class Main3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Circle c=new Circle(50, 100, 50,Color.AQUA);
        c.setStroke(Color.ANTIQUEWHITE);
        c.setStrokeWidth(3);
        DropShadow dropShadow=new DropShadow();
        dropShadow.setColor(Color.BROWN);
        dropShadow.setOffsetY(13.0);    
        dropShadow.setOffsetX(13.0);

        c.setEffect(dropShadow);
        pane.getChildren().addAll(c);
        Scene s = new Scene(pane, 600, 300, Color.BEIGE);
        primaryStage.setTitle("welcome");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

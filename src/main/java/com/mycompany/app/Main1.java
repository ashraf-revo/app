/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
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
public class Main1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane=new StackPane();
        DropShadow shadow=new DropShadow();
        shadow.setColor(Color.AQUA);
        shadow.setOffsetY(3.0);
        
        Rectangle rectangle=new Rectangle(400,60,Color.CADETBLUE);
        rectangle.setEffect(shadow);
        rectangle.setArcHeight(20);
        rectangle.setArcWidth(20);
        
        Text t=new Text("hello from javafx");
        t.setEffect(shadow);
        t.setFont(Font.font(null, FontWeight.BOLD, 30));
        t.setFill(Color.DARKGREY);
        
        FadeTransition fadeTransition=new FadeTransition(Duration.seconds(5), t);
        fadeTransition.setFromValue(1.0);
        fadeTransition.setToValue(0.0);
        fadeTransition.setAutoReverse(true);
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.play();
        
        pane.getChildren().addAll(rectangle,t);
        Scene s = new Scene(pane, 600, 300,Color.BEIGE);
        primaryStage.setTitle("welcome");
        primaryStage.setScene(s);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

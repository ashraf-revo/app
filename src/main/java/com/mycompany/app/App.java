/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author revo
 */
public class App extends Application {

    double x;
    double y;

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane g = new StackPane();
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Scene s = new Scene(g, 300, 500, Color.TRANSPARENT);
        Circle dragger = new Circle(100);
        dragger.setOpacity(.6);
        Image imageView = new Image("file:///home/revo/Documents/a.gif");
        dragger.setFill(new ImagePattern(imageView));
        dragger.setEffect(new Reflection());
        g.getChildren().add(dragger);
        g.setAlignment(Pos.CENTER);
        g.setOnMouseClicked((MouseEvent event) -> {
            if (event.getClickCount() == 2) {
                primaryStage.setIconified(true);
            }
        });
        g.setOnMousePressed((MouseEvent event) -> {
            x = event.getScreenX() - primaryStage.getX();
            y = event.getScreenY() - primaryStage.getY();
        });
        g.setOnMouseDragged((MouseEvent event) -> {
            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
        primaryStage.setScene(s);
        primaryStage.setTitle("welcome");
        primaryStage.show();

    }

    void pagnation(Group g) {

    }

    void Prograsbar(Group g) {
        ProgressBar bar = new ProgressBar();
        bar.setProgress(.5);
        bar.setPrefWidth(300);
        g.getChildren().add(bar);
    }

    void indecator1(Group g) {
        ProgressIndicator pi1 = new ProgressIndicator();
        pi1.setPrefSize(50, 50);
        g.getChildren().addAll(pi1);
    }

    void indecator2(Group g) {
        ProgressIndicator pi2 = new ProgressIndicator();
        pi2.setPrefSize(50, 50);
        pi2.setProgress(1.0);
        g.getChildren().addAll(pi2);
    }

    public static void main(String[] args) {
        launch(args);
    }

}

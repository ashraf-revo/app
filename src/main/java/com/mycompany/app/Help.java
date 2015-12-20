/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.ScaleTransitionBuilder;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author revo
 */
public class Help {
    private List<RevoView> revoViews = new ArrayList<>();
    private List<Circle> cs = new ArrayList<>();
    private StackPane pane = new StackPane();
    private HBox box = new HBox();

    public Help(List<RevoView> revoViews, StackPane sp) {
        this.revoViews = revoViews;
        this.pane = sp;
        for (int i = 0; i < revoViews.size(); i++) {
            Circle w = new Circle(20);
            w.setFill(new ImagePattern(new Image(getClass().getResource(revoViews.get(i).getIcon()).toString())));
            w.setOpacity(.6);
            cs.add(w);
        }


        pane.getChildren().add(revoViews.get(0).getPane());
        for (int i = 0; i < cs.size(); i++) {
            final int finalI = i;
            cs.get(i).setOnMouseClicked((MouseEvent event) -> {
                pane.getChildren().clear();
                FadeTransition fadeTransition1 = new FadeTransition(Duration.seconds(1), revoViews.get(finalI).getPane());
                fadeTransition1.setFromValue(0.0);
                fadeTransition1.setToValue(1.0);
                fadeTransition1.setCycleCount(1);
                fadeTransition1.play();
                pane.getChildren().add(revoViews.get(finalI).getPane());
            });
        }
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(cs);
        BorderPane.setMargin(box, new Insets(20));
    }

    public ScaleTransition getGo() {
        return ScaleTransitionBuilder.create().
                node(box).duration(Duration.seconds(.5)).toX(2).toY(2).build();

    }

    public ScaleTransition getBack() {
        return ScaleTransitionBuilder.create()
                .node(box).duration(Duration.seconds(.5)).toX(1).toY(1).build();

    }

    public HBox getBox() {
        return box;
    }
}

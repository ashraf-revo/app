package com.mycompany.app;

import javafx.scene.layout.AnchorPane;

/**
 * Created by revo on 20/12/15.
 */
public class RevoView {
    private String icon;
    private AnchorPane pane;

    public RevoView(String icon, AnchorPane pane) {
        this.icon = icon;
        this.pane = pane;
    }

    public String getIcon() {
        return icon;
    }

    public AnchorPane getPane() {
        return pane;
    }
}

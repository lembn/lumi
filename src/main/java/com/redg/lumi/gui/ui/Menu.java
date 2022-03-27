package com.redg.lumi.gui.ui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

class Menu extends VBox {

    public Menu() {
        setSpacing(15);
        setPadding(new Insets(10, 10, 10, 10));
        setAlignment(Pos.TOP_CENTER);
        getStyleClass().add("menu");

        Text title = new Text("SETTINGS");
        title.getStyleClass().addAll("text", "title");
        Input debrisInput = new Input("Debris", "Number of debris");
        Input speedScale = new Input("Speed Scale", "Simulation speed");

        getChildren().addAll(title, debrisInput, speedScale);
    }
}

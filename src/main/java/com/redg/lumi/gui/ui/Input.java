package com.redg.lumi.gui.ui;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

class Input extends VBox {
    public Input(String title, String prompt) {
        setSpacing(10);
        setAlignment(Pos.CENTER);

        Label label = new Label(title);
        label.getStyleClass().add("text");
        TextField textField = new TextField();
        textField.setPromptText(prompt + "...");
        textField.setPrefWidth(200);
        textField.getStyleClass().add("text");

        getChildren().addAll(label, textField);
    }
}

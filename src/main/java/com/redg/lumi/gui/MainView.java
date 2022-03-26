package com.redg.lumi.gui;

import com.redg.lumi.gui.ui.UI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainView extends Stage {
    private static final int ROOT_PAD = 10;

    public MainView() {
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER_LEFT);
        root.setPadding(new Insets(ROOT_PAD, ROOT_PAD, ROOT_PAD, ROOT_PAD));

        root.getChildren().addAll(new UI());
        root.requestFocus();

        Scene scene = new Scene(root, 1600, 850);
        scene.getStylesheets().add(getClass().getResource("styles.css").toString());

        this.setScene(scene);
        this.setTitle("Lumi");
        this.show();
    }
}

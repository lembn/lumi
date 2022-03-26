package com.redg.lumi.gui;

import com.redg.lumi.gui.simulation.SimulationView;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import com.redg.lumi.gui.ui.UI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends Stage {
    private static final int HEIGHT = 850;
    private static final int WIDTH = 1600;

    public MainView() {
        // setup 3d container
        StackPane root3d = new StackPane();
        SubScene subScene = new SubScene(root3d, WIDTH, HEIGHT,true, SceneAntialiasing.BALANCED);
        SimulationView simView = new SimulationView(subScene);
        root3d.getChildren().add(simView);

        // setup UI container
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER_LEFT);
        root.setPadding(new Insets(10, 10, 10, 10));
        root.getChildren().addAll(root3d, new UI());
        root.requestFocus();

        // setup main scene
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.getStylesheets().add(getClass().getResource("styles.css").toString());

        this.setScene(scene);
        this.setTitle("Lumi");
        this.show();
    }
}

package com.redg.lumi.gui;

import com.redg.lumi.dataProcessing.SatelliteData;
import com.redg.lumi.gui.simulation.SimulationView;
import com.redg.lumi.gui.ui.UI;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.SubScene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends Stage {
    private static final int HEIGHT = 850;
    private static final int WIDTH = 1600;

    public MainView(SatelliteData envisatData, SatelliteData globalstarData) {
        // setup 3d environment
        Pane root3D = new Pane();
        root3D.getStyleClass().add("background");
        SubScene scene3D = new SubScene(root3D, WIDTH, HEIGHT, true, SceneAntialiasing.BALANCED);
        SimulationView simulationView = new SimulationView(scene3D, envisatData, globalstarData);
        root3D.getChildren().add(simulationView);

        StackPane root = new StackPane();
        root.getStyleClass().add("background");
        UI ui = new UI();
        root.setAlignment(ui, Pos.TOP_LEFT);
        root.getChildren().addAll(scene3D, ui);

        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toString());

        this.setScene(scene);
        this.setTitle("Lumi");
        this.show();
    }
}

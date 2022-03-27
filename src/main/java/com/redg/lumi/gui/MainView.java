package com.redg.lumi.gui;

import com.redg.lumi.dataProcessing.SatelliteData;
import com.redg.lumi.gui.simulation.SimulationView;
import com.redg.lumi.gui.ui.UI;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainView extends Stage {
    private static final int HEIGHT = 850;
    private static final int WIDTH = 1600;

    public MainView(SatelliteData envisatData, SatelliteData globalstarData) {
        // setup UI container
        // StackPane root = new StackPane();
        // root.setAlignment(Pos.CENTER_LEFT);
        // root.setPadding(new Insets(10, 10, 10, 10));
        // root.getChildren().addAll(new UI());
        // root.requestFocus();

        // setup main scene
        // Scene scene = new Scene(root, WIDTH, HEIGHT);
        // scene.getStylesheets().add(getClass().getResource("styles.css").toString());

        BorderPane root3D = new BorderPane();
        Scene scene3D = new Scene(root3D, 800, 600, true);
        scene3D.setFill(Color.BLACK);

        SimulationView simulationView = new SimulationView(scene3D, envisatData, globalstarData);
        root3D.setCenter(simulationView);

        this.setScene(scene3D);
        this.setTitle("Lumi");
        this.show();
    }
}

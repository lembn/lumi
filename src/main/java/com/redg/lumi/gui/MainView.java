package com.redg.lumi.gui;

import com.redg.lumi.dataProcessing.SatelliteData;
import com.redg.lumi.gui.simulation.SimulationView;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainView extends Stage {
    SimulationView simulationView;

    public MainView(SatelliteData envisatData, SatelliteData globalstarData) {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 800, 600, true);

        scene.setFill(Color.BLACK);

        simulationView = new SimulationView(scene, envisatData, globalstarData);

        root.setCenter(simulationView);

        this.setScene(scene);
        this.setTitle("Lumi");
        this.show();
    }
}

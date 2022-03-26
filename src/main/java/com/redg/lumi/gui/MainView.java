package com.redg.lumi.gui;

import com.redg.lumi.gui.simulation.SimulationView;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView extends Stage {
    public MainView() {
        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 800, 600);

        root.setCenter(new SimulationView(scene));

        this.setScene(scene);
        this.setTitle("Lumi");
        this.show();
    }
}

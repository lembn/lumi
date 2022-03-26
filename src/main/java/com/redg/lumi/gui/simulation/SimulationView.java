package com.redg.lumi.gui.simulation;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class SimulationView extends AnchorPane {
    private Camera camera = new Camera();
    private Space space = new Space(); // The 3D space which holds objects
    private Earth earth = new Earth();
    private Sun sun = new Sun();

    public SimulationView(Scene scene) {
        scene.setCamera(camera);

        space.add(earth, sun);

        this.getChildren().add(space);
    }
}

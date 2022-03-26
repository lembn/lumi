package com.redg.lumi.gui.simulation;

import com.redg.lumi.data.Position;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class SimulationView extends AnchorPane {
    private Camera camera = new Camera();
    private Space space = new Space(); // The 3D space which holds objects
    private Earth earth = new Earth();
    private Sun sun = new Sun();
    private Satellite envisatSatellite;
    private Satellite globalstarSatellite;

    public SimulationView(Scene scene) {
        scene.setCamera(camera);

        envisatSatellite = new Satellite(new Position(0.0, 0.0, 0.0));
        globalstarSatellite = new Satellite(new Position(0.0, 0.0, 0.0));

        space.add(earth, sun, envisatSatellite, globalstarSatellite);

        this.getChildren().add(space);
    }
}

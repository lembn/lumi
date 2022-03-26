package com.redg.lumi.gui.simulation;

import com.redg.lumi.dataProcessing.Position;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class SimulationView extends AnchorPane {
    private Camera camera;
    private Space space = new Space(); // The 3D space which holds objects
    private Earth earth = new Earth();
    private Sun sun = new Sun();
    private Satellite envisatSatellite;
    private Satellite globalstarSatellite;

    public SimulationView(SubScene scene) {
        camera = new Camera(scene, space);

        envisatSatellite = new Satellite(new Position(-59, -31, 84));
        globalstarSatellite = new Satellite(new Position(0, 0, -125));

        space.add(earth, sun, envisatSatellite, globalstarSatellite);

        this.getChildren().add(space);
    }

    public Camera getCamera() {
        return camera;
    }
}

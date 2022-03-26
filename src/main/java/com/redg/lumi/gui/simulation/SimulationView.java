package com.redg.lumi.gui.simulation;

import com.redg.lumi.dataProcessing.Position;
import com.redg.lumi.dataProcessing.SatelliteData;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class SimulationView extends AnchorPane {
    private Camera camera;
    private Space space = new Space(); // The 3D space which holds objects
    private Earth earth = new Earth();
    private Sun sun = new Sun();
    private Satellite envisatSatellite;
    private Satellite globalstarSatellite;

    public SimulationView(Scene scene) {
        SatelliteData envisatData = new SatelliteData();
        SatelliteData globalstarData = new SatelliteData();

        camera = new Camera(scene, space);
        envisatSatellite = new Satellite(envisatData);
        globalstarSatellite = new Satellite(globalstarData);

        scene.setCamera(camera);

        space.add(earth, sun, envisatSatellite, globalstarSatellite);

        this.getChildren().add(space);
    }
}

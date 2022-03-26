package com.redg.lumi.gui.simulation;

import com.redg.lumi.dataProcessing.SatelliteData;
import javafx.scene.DepthTest;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class Satellite extends Sphere {
    public Satellite(SatelliteData satelliteData) {
        this.translateXProperty().bind(satelliteData.getPosition().getXProperty());
        this.translateYProperty().bind(satelliteData.getPosition().getYProperty());
        this.translateZProperty().bind(satelliteData.getPosition().getZProperty());

        this.setRadius(2);
        PhongMaterial material = new PhongMaterial(Color.WHITE);
        material.setSelfIlluminationMap(new Image(getClass().getResource("white-self-illumination-map.png").toString()));
        this.setMaterial(material);
        this.setDepthTest(DepthTest.ENABLE);
    }
}
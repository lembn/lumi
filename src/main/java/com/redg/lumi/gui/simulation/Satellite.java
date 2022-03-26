package com.redg.lumi.gui.simulation;

import javafx.scene.DepthTest;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.Material;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;
import com.redg.lumi.dataProcessing.Position;

public class Satellite extends Sphere {
    public Satellite(Position initialPosition) {
        this.setTranslateX(initialPosition.getX());
        this.setTranslateY(initialPosition.getY());
        this.setTranslateZ(initialPosition.getZ());

        this.setRadius(2);
        PhongMaterial material = new PhongMaterial(Color.WHITE);
        material.setSelfIlluminationMap(new Image(getClass().getResource("white-self-illumination-map.png").toString()));
        this.setMaterial(material);
        this.setDepthTest(DepthTest.ENABLE);
    }
}
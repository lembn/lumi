package com.redg.lumi.gui.simulation;

import javafx.scene.DepthTest;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Sphere;

public class Earth extends Sphere {
    public Earth() {
        this.setRadius(100);
        this.setMaterial(new PhongMaterial(Color.BLUE));
        this.setDepthTest(DepthTest.ENABLE);
    }
}

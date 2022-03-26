package com.redg.lumi.gui.simulation;

import javafx.scene.PointLight;

public class Sun extends PointLight {
    public Sun() {
        this.setTranslateX(30);
        this.setTranslateY(-30);
        this.setTranslateZ(-50);
    }
}

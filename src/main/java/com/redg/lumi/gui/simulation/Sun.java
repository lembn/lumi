package com.redg.lumi.gui.simulation;

import javafx.scene.PointLight;

public class Sun extends PointLight {
    public Sun() {
        this.setTranslateX(6371000 * 2);
        this.setTranslateY(-6371000 * 2);
        this.setTranslateZ(-6371000 * 2);
    }
}

package com.redg.lumi.gui.simulation;

import javafx.scene.AmbientLight;

public class Sun extends AmbientLight {
    public Sun() {
        this.setTranslateX(30);
        this.setTranslateY(-30);
        this.setTranslateZ(-50);
    }
}

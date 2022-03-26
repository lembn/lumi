package com.redg.lumi.gui.simulation;

import javafx.scene.PerspectiveCamera;

public class Camera extends PerspectiveCamera {
    public Camera() {
        super(true);

        this.setFarClip(1000);
        this.setTranslateX(-15);
        this.setTranslateY(-15);
        this.setTranslateZ(-150);
    }
}

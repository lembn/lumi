package com.redg.lumi.gui.simulation;

import javafx.scene.PerspectiveCamera;

public class Camera extends PerspectiveCamera {
    public Camera() {
        super(true);

        this.setFarClip(6371000 * 50);
        this.setTranslateX(-6371000 * 0.25);
        this.setTranslateY(-6371000 * 0.25);
        this.setTranslateZ(-6371000 * 10.25);
    }
}

package com.redg.lumi.dataProcessing;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class SatelliteData {
    Position position = new Position(-59, -31, 84);

    public void setPosition(Position position) {
        this.position.getXProperty().setValue(position.getXProperty().get());
        this.position.getYProperty().setValue(position.getYProperty().get());
        this.position.getZProperty().setValue(position.getZProperty().get());
    }

    public Position getPosition() {
        return position;
    }
}

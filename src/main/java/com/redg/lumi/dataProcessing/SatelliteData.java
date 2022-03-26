package com.redg.lumi.dataProcessing;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class SatelliteData {
    Position position = new Position(-59, -31, 84);

    public SatelliteData() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.01), e -> {
                    rotatePointIn2D(0.0, 0.0, 0.01, this.position);
                })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void rotatePointIn2D(double cx, double cy, double angle, Position p)
    {
        double s = Math.sin(angle);
        double c = Math.cos(angle);

        // translate point back to origin:
        p.setX(p.getXProperty().getValue() - cx);
        p.setY(p.getYProperty().getValue() - cy);

        // rotate point
        double newX = p.getXProperty().getValue() * c - p.getYProperty().getValue() * s;
        double newY = p.getXProperty().getValue() * s + p.getYProperty().getValue() * c;

        // translate point back:
        p.setX(newX + cx);
        p.setY(newY + cy);
    }

    public Position getPosition() {
        return position;
    }
}

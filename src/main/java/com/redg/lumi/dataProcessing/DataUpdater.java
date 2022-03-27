package com.redg.lumi.dataProcessing;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class DataUpdater {
    private GroundStation[] stations;
    private SatelliteState satelliteState;
    private SatelliteData satelliteData;

    private int step = 0;

    public DataUpdater(JacksonMapper jacksonMapper, SatelliteData satelliteData) {
        this.stations = jacksonMapper.getStations();
        this.satelliteData = satelliteData;
        this.satelliteState = jacksonMapper.getSatelliteState();

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.001), e -> {
                    update();
                })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        update();
    }

    private void update() {
        double x = satelliteState.position[step][0];
        double y = satelliteState.position[step][1];
        double z = satelliteState.position[step][2];

        step++;

        if (step >= satelliteState.position.length) {
            step = 0;
        }

        x *= 0.000015;
        y *= 0.000015;
        z *= 0.000015;

        satelliteData.setPosition(new Position(x, y, z));
    }
}

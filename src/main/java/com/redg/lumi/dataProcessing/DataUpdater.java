package com.redg.lumi.dataProcessing;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class DataUpdater {
    private GroundStation[] stations;
    private SatelliteData satelliteData;

    private int stationIndex = 0;
    private int passesIndex = 1;
    private int positionsIndex = 0;

    public DataUpdater(JacksonMapper jacksonMapper, SatelliteData satelliteData) {
        this.stations = jacksonMapper.getStations();
        this.satelliteData = satelliteData;

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0.0001), e -> {
                    update();
                })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        update();
    }

    private void update() {
        double x = stations[stationIndex].passes[passesIndex].positions[positionsIndex][0];
        double y = stations[stationIndex].passes[passesIndex].positions[positionsIndex][1];
        double z = stations[stationIndex].passes[passesIndex].positions[positionsIndex][2];

        positionsIndex++;

        // bound checks
        if (positionsIndex >= stations[stationIndex].passes[passesIndex].positions.length) {
            positionsIndex = 0;
            stationIndex++;
        }
        if (stationIndex >= stations.length) {
            stationIndex = 0;
            passesIndex++;
        }
        if (passesIndex >= stations[stationIndex].passes.length) {
            stationIndex = 0;
            passesIndex = 1;
            positionsIndex = 0;
        }

        //System.out.println(String.format("Station: %d, Pass: %d, Position: %d", stationIndex, passesIndex, positionsIndex));

        x *= 0.000015;
        y *= 0.000015;
        z *= 0.000015;

        satelliteData.setPosition(new Position(x, y, z));
    }
}

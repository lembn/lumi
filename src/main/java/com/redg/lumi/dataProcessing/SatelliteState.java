package com.redg.lumi.dataProcessing;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SatelliteState {
    public final double[][] position;
    public final double[][] velocity;
    public final double[] pitch;
    public final double[] roll;
    public final double[] yaw;
    public final double[] time;

    @JsonCreator
    public SatelliteState(@JsonProperty("pos") double[][] position, @JsonProperty("vel") double[][] velocity, @JsonProperty("pitch") double[] pitch, @JsonProperty("roll") double[] roll,
                          @JsonProperty("yaw") double[] yaw, @JsonProperty("time") double[] time) {
        this.position = position;
        this.velocity = velocity;
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
        this.time = time;
    }
}

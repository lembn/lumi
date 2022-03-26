package com.redg.lumi.dataProcessing;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class SatellitePass {

    public final double[] azimuth;


    public final double[] elevation;


    public final double[] time;


    public final double[] rangeResiduals;


    public final double[][] q;


    public final double[][][]  A_b2i;


    public final String satTime;


    public final double[][] positions;


    public final double[][] velocities;


    public final double[][] angularVelocities;


    public final double[] pitch;


    public final double[] roll;


    public final double[] yaw;


    public final double[][] groundStationLoc;


    public final double[][] laserPointer;


    public final double[] range;

    @JsonCreator
    public SatellitePass
            (@JsonProperty("azimuth") double[] azimuth, @JsonProperty("elevation") double[] elevation, @JsonProperty("time") double[] time,
             @JsonProperty("range residual") double[] rangeResiduals, @JsonProperty("q") double[][] q,
             @JsonProperty("A_b2i") double[][][] A_b2i,@JsonProperty("start datetime") String satTime, @JsonProperty("pos") double[][] positions, @JsonProperty("vel") double[][] velocities,
             @JsonProperty("w") double[][] angularVelocities, @JsonProperty("pitch") double[] pitch,
             @JsonProperty("roll") double[] roll, @JsonProperty("yaw") double[] yaw,
             @JsonProperty("gs vec") double[][] groundStationLoc, @JsonProperty("rr vec") double[][] laserPointer,
             @JsonProperty("range") double[] range) {

        this.azimuth = azimuth;
        this.elevation = elevation;
        this.time = time;
        this.rangeResiduals = rangeResiduals;
        this.q = q;
        this.A_b2i = A_b2i;
        this.satTime = satTime;
        this.positions = positions;
        this.velocities = velocities;
        this.angularVelocities = angularVelocities;
        this.pitch = pitch;
        this.roll = roll;
        this.yaw = yaw;
        this.groundStationLoc = groundStationLoc;
        this.laserPointer = laserPointer;
        this.range = range;

    }
}

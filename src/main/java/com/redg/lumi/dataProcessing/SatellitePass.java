package com.redg.lumi.dataProcessing;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class SatellitePass {
    @JsonProperty("azimuth")
    public final double[] azimuth;

    @JsonProperty("elevation")
    public final double[] elevation;

    @JsonProperty("time")
    public final double[] time;

    @JsonProperty("range residuals")
    public final double[] rangeResiduals;

    @JsonProperty("q")
    public final double[][] q;

    @JsonProperty("A_b2i")
    public final double[][][]  A_b2i;

    @JsonProperty("start datetime")
    public final Date satTime;

    @JsonProperty("pos")
    public final double[][] positions;

    @JsonProperty("vel")
    public final double[][] velocities;

    @JsonProperty("w")
    public final double[][] angularVelocities;

    @JsonProperty("pitch")
    public final double[] pitch;

    @JsonProperty("roll")
    public final double[] roll;

    @JsonProperty("yaw")
    public final double[] yaw;

    @JsonProperty("gs vec")
    public final double[][] groundStationLoc;

    @JsonProperty("rr vec")
    public final double[][] laserPointer;

    @JsonProperty("range")
    public final double[] range;

    @JsonCreator
    public SatellitePass
            (double[] azimuth,double[] elevation, double[] time,double[] rangeResiduals,double[][] q,
            double[][][] A_b2i,Date satTime,double[][] positions,double[][] velocities,double[][] angularVelocities,
             double[] pitch,double[] roll,double[] yaw,double[][] groundStationLoc, double[][] laserPointer,
             double[] range) {
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

package com.redg.lumi.dataProcessing;

import java.util.List;

public class GroundStation extends SimulationChild{
    private int stationID;
    private double longitude;
    private double latitude;
    private double altitude;
    private List<SatallitePass> stationReadings;

    //private ArrayList<Pass> passes;
    public GroundStation(int givenID, double givenLon, double givenLat, double givenAlt, List<SatallitePass> givenReadings){
        this.stationID = givenID;
        this.longitude = givenLon;
        this.latitude = givenLat;
        this.altitude = givenAlt;
        this.stationReadings = givenReadings;
    }

    public int getStationID(){
        return this.stationID;
    }

    public double getLongitude(){
        return this.longitude;
    }

    public double getLatitude(){
        return this.latitude;
    }

    public double getAltitude(){
        return this.altitude;
    }

    public List<SatallitePass> getStationReadings(){
        return this.stationReadings;
    }
}

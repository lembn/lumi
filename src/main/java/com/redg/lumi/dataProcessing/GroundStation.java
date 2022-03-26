package com.redg.lumi.dataProcessing;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class GroundStation extends SimulationChild{

    public int stationID;

    public double longitude;

    public double latitude;

    public double altitude;


    public ArrayList<SatellitePass> stationReadings;

    //private List<SatellitePass> stationReadings;

    //private ArrayList<Pass> passes;
    public GroundStation(@JsonProperty("ID") int givenID , @JsonProperty("lon") int lon,@JsonProperty("lat") int lat,
                         @JsonProperty("alt") int alt ,@JsonProperty("passes" ) ArrayList<SatellitePass> stationReadings){
        stationReadings = new ArrayList<>();
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

    public ArrayList<SatellitePass> getStationReadings(){
        return this.stationReadings;
    }
}

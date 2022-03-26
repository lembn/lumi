package com.redg.lumi.dataProcessing;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroundStation extends SimulationChild{

    public int stationID;

    public double longitude;

    public double latitude;

    public double altitude;

    public SatellitePass[] passes;

    public GroundStation(@JsonProperty("ID") int givenID , @JsonProperty("lon") int lon,@JsonProperty("lat") int lat,
                         @JsonProperty("alt") int alt, @JsonProperty("passes") SatellitePass[] passes) {
        this.passes = passes;
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
}

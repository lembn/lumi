package com.redg.lumi.dataProcessing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;

public class JacksonMapper {
    private SatelliteState state;
    private GroundStation[] stations;

    public JacksonMapper(String satelliteName) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            state = mapper.readValue(JacksonMapper.class.getResource(satelliteName + "_state.json"), SatelliteState.class);
            stations = mapper.readValue(JacksonMapper.class.getResource(satelliteName + "_passes.json"), GroundStation[].class);

            System.out.println((Arrays.toString(stations[0].passes[1].azimuth)));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SatelliteState getSatelliteState() { return this.state; }
    public GroundStation[] getStations() { return this.stations; }
}

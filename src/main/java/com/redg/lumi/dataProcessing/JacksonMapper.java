package com.redg.lumi.dataProcessing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Arrays;

public class JacksonMapper {
    private GroundStation[] stations;

    public JacksonMapper(String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            stations = mapper.readValue(JacksonMapper.class.getResource(path), GroundStation[].class);

            System.out.println((Arrays.toString(stations[0].passes[1].azimuth)));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GroundStation[] getStations() { return this.stations; }
}

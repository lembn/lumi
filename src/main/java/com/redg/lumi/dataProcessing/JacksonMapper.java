package com.redg.lumi.dataProcessing;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

public class JacksonMapper {
    public static void main(String args[])
    {
        ObjectMapper mapper = new ObjectMapper();
        String inputJson = String.valueOf(JacksonMapper.class.getResource());
        //String inputJson = inputURL.toString();
        //String inputJson = "resources\\com\\redg\\lumi\\dataProcessing\\envisat_passes.json";
        try{

            mapper = new ObjectMapper();

                GroundStation[] stations;
                stations = mapper.readValue(new File(inputJson),GroundStation[].class);
                System.out.println((stations[0].stationReadings.get(0).azimuth));

        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        {

    }

    }
}

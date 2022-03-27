package com.redg.lumi;

import com.redg.lumi.dataProcessing.DataUpdater;
import com.redg.lumi.dataProcessing.JacksonMapper;
import com.redg.lumi.dataProcessing.SatelliteData;
import com.redg.lumi.gui.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        SatelliteData envisatData = new SatelliteData();
        SatelliteData globalstarData = new SatelliteData();

        MainView mainView = new MainView(envisatData, globalstarData);
        new DataUpdater(new JacksonMapper("envisat_passes.json"), envisatData);
        //new DataUpdater(new JacksonMapper("globalstar_passes.json"), globalstarData);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
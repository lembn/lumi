package com.redg.lumi;

import com.redg.lumi.gui.MainView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage stage) {
        new MainView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
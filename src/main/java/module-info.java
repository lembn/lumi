module com.redg.lumi {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;


    opens com.redg.lumi to javafx.fxml;
    exports com.redg.lumi;
    exports com.redg.lumi.dataProcessing;
    opens com.redg.lumi.dataProcessing to javafx.fxml;
}
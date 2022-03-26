module com.redg.lumi {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.redg.lumi to javafx.fxml;
    exports com.redg.lumi;
}
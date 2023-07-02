module com.example.piglatingenerator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piglatingenerator to javafx.fxml;
    exports com.example.piglatingenerator;
}
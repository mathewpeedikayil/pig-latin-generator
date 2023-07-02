/**
 * Main.java
 * Created on 02/07/2023
 * Last modified on 02/07/2023
 * No copyright
 * This class represents the main GUI.
 * Version History: 1.0 - only pure code; 2.0 - comments added.
 *
 * @author Mathew Philip Peedikayil
 * @version 2.0
 */

package com.example.piglatingenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Pig Latin Generator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

// References
// JavaFX and Scene Builder Beginner Course - IntelliJ #4: Text and TextField
// https://www.youtube.com/watch?v=zx023kSsn94&ab_channel=Randomcode
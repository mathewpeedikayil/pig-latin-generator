package com.example.piglatingenerator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {

    private String englishInput;
    private String[] words;
    private String pigLatinOutput;
    private char firstCharacterOfEachWord;

    @FXML
    private Button generatePigLatinButton;

    @FXML
    private Text pigLatinText;

    @FXML
    private TextField userInput;

    @FXML
    void displayPigLatin(MouseEvent event) {
        englishInput = userInput.getText();
        words = englishInput.split(" ");
        pigLatinOutput = "";

        for(int i = 0; i < words.length; i++) {
            if(i == 0) {
                pigLatinOutput += words[i] + "AY ";
            } else {
                firstCharacterOfEachWord = words[i].charAt(0);
                pigLatinOutput += words[i].substring(1) + "" + firstCharacterOfEachWord + "AY ";
            }
        }

        pigLatinText.setText(pigLatinOutput);
    }
    // test sentence
    // I SLEPT MOST OF THE NIGHT

}


// Scene Builder
// View -> Show Sample Controller Skeleton
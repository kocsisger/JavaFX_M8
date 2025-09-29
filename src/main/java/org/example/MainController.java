package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void loadData() {

    }

    @FXML
    private Label seasonLabel;

    @FXML
    void handleClick() {
        System.out.println("Hello season!!!");
        if (seasonLabel.getText().equals("Summer"))
            seasonLabel.setText("Autumn");
        else
            seasonLabel.setText("Summer");
    }

    @FXML
    private void initialize() {

    }
}

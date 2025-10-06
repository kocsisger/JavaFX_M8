package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class MainController {

    Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void loadData() {
        //nameLabel.setText(model.getStudent().getName());
        //Connects the observer to the observable
        nameLabel.textProperty().bind(model.getStudent().nameProperty());

        creditsLabel.setText("" + model.getStudent().getCredits());
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());

    }

    @FXML
    void changeData() {
        model.getStudent().setName("Tom Smith");
        //Not needed since namelabel observes the Student's name
      //  nameLabel.setText(model.getStudent().getName());
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

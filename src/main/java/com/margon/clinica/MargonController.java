package com.margon.clinica;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MargonController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("App em construção! Aguarde...");
    }
}
package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SecuritySettingsController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField confirmPasswordField;

    @FXML
    private Button btnSaveSettings;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleSaveSettings() {
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (password.isEmpty() || confirmPassword.isEmpty()) {
            System.out.println("Password fields cannot be empty.");
            return;
        }

        if (password.length() < 3) {
            System.out.println("Password must be at least 3 characters long.");
            return;
        }

        System.out.println("Password set successfully.");
    }

    @FXML
    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}

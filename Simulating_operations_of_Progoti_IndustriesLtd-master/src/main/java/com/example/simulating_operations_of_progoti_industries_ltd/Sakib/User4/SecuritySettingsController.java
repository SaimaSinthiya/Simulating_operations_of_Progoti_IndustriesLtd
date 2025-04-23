package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SecuritySettingsController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField confirmPasswordField;

    @FXML
    private CheckBox enableTwoFactorCheckbox;

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
        boolean isTwoFactorEnabled = enableTwoFactorCheckbox.isSelected();

        if (password.equals(confirmPassword)) {
            System.out.println("Password set successfully.");
            if (isTwoFactorEnabled) {
                System.out.println("Two-Factor Authentication enabled.");
            } else {
                System.out.println("Two-Factor Authentication disabled.");
            }
        } else {
            System.out.println("Passwords do not match.");
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}

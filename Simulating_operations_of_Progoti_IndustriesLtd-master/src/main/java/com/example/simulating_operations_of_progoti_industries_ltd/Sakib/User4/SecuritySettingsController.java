package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class SecuritySettingsController {

    @FXML
    private TextField passwordField;

    @FXML
    private TextField confirmPasswordField;

    @FXML
    private Button btnSaveSettings;

    @FXML
    private Button btnBackToDashboard;

    // Assuming a flag for Two-Factor Authentication status
    private boolean isTwoFactorEnabled = false;

    @FXML
    public void initialize() {
        // Initialize if needed
    }

    // Save settings (password and two-factor authentication)
    @FXML
    private void handleSaveSettings() {
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        // Check if fields are empty
        if (password.isEmpty() || confirmPassword.isEmpty()) {
            System.out.println("Password fields cannot be empty.");
            return;
        }

        // Password length validation
        if (password.length() < 3) {
            System.out.println("Password must be at least 3 characters long.");
            return;
        }

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match.");
            return;
        }

        // Save the password (You can save it securely in your system here)
        System.out.println("Password set successfully.");

        // Example of enabling/disabling Two-Factor Authentication (for now it's just a toggle)
        if (isTwoFactorEnabled) {
            System.out.println("Two-Factor Authentication enabled.");
        } else {
            System.out.println("Two-Factor Authentication disabled.");
        }
    }

    // Action to navigate back to the Dashboard
    @FXML
    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

        // Navigate back to the dashboard screen
        navigateBackToDashboard();
    }

    // Method to navigate back to the dashboard
    private void navigateBackToDashboard() {
        try {
            Stage stage = (Stage) btnBackToDashboard.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinanceDepartmentHeadDashBoard.fxml"));
            Scene dashboardScene = new Scene(loader.load());
            stage.setScene(dashboardScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

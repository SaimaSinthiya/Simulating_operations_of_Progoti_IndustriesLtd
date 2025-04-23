package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AfterSalesSupportController {

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField orderIdField;

    @FXML
    private TextArea issueDescriptionField;

    @FXML
    private Button btnSubmitIssue;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleSubmitIssue() {
        String customerName = customerNameField.getText();
        String orderId = orderIdField.getText();
        String issueDescription = issueDescriptionField.getText();

        if (!customerName.isEmpty() && !orderId.isEmpty() && !issueDescription.isEmpty()) {
            System.out.println("Issue submitted successfully for Order ID: " + orderId);
            System.out.println("Customer: " + customerName);
            System.out.println("Issue Description: " + issueDescription);
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}
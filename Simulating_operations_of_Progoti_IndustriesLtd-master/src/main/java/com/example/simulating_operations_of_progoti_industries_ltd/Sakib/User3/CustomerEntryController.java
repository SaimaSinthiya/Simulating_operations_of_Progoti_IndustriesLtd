package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CustomerEntryController {

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField customerEmailField;

    @FXML
    private TextField customerPhoneField;

    @FXML
    private Button btnSubmitCustomer;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleSubmitCustomer() {
        String customerName = customerNameField.getText();
        String customerEmail = customerEmailField.getText();
        String customerPhone = customerPhoneField.getText();

        if (!customerName.isEmpty() && !customerEmail.isEmpty() && !customerPhone.isEmpty()) {
            System.out.println("Customer Info Submitted:");
            System.out.println("Name: " + customerName);
            System.out.println("Email: " + customerEmail);
            System.out.println("Phone: " + customerPhone);
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void back() {
        System.out.println("Navigating back to Dashboard...");

    }
}

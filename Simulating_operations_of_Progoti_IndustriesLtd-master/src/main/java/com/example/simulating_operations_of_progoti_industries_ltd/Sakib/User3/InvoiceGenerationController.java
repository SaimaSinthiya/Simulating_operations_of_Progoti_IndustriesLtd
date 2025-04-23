package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InvoiceGenerationController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField amountField;

    @FXML
    private Button btnGenerateInvoice;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleGenerateInvoice() {
        String orderId = orderIdField.getText();
        String customerName = customerNameField.getText();
        String amount = amountField.getText();

        if (!orderId.isEmpty() && !customerName.isEmpty() && !amount.isEmpty()) {
            System.out.println("Invoice generated for Order ID: " + orderId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Amount: " + amount);
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}
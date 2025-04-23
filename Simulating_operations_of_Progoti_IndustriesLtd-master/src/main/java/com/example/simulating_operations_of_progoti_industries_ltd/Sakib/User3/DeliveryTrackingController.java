package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class DeliveryTrackingController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextField trackingNumberField;

    @FXML
    private Button btnTrackDelivery;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleTrackDelivery() {
        String orderId = orderIdField.getText();
        String trackingNumber = trackingNumberField.getText();

        if (!orderId.isEmpty() && !trackingNumber.isEmpty()) {
            System.out.println("Tracking delivery for Order ID: " + orderId);
            System.out.println("Tracking Number: " + trackingNumber);
        } else {
            System.out.println("Please enter both Order ID and Tracking Number.");
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}
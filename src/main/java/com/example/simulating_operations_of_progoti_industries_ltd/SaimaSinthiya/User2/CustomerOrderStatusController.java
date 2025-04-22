package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CustomerOrderStatusController {

    @FXML
    private Label orderStatusTitle;

    @FXML
    private Label orderIdLabel;

    @FXML
    private Label orderStatusLabel;

    @FXML
    private Button backButton;


    private String orderId = "ORD12345";
    private String orderStatus = "Shipped";


    @FXML
    public void initialize() {
        // Set initial values (you can dynamically load this data)
        orderIdLabel.setText("Order ID: " + orderId);
        orderStatusLabel.setText("Status: " + orderStatus);
    }


    @FXML
    public void handleBack(ActionEvent event) {
        System.out.println("Back button clicked");

    }
}

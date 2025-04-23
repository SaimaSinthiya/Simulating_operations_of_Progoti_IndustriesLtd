package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerPaymentController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextField paymentAmountField;

    @FXML
    private ComboBox<String> paymentMethodCOmbobox;

    @FXML
    private Button backButton;

    private static int orderCounter = 1001;

    @FXML
    public void initialize() {

        String generatedId = "ORD" + orderCounter;
        orderCounter++;
        orderIdField.setText(generatedId);
        orderIdField.setEditable(false);

        // Add payment options
        paymentMethodCOmbobox.getItems().addAll("Cash", "Card", "Bkash", "Nagad");
    }

    @FXML
    public void handleSubmitPayment(ActionEvent event) {
        String orderId = orderIdField.getText();
        String amount = paymentAmountField.getText();
        String method = paymentMethodCOmbobox.getValue();

        if (amount.isEmpty() || method == null) {
            showAlert("Please fill in all fields.");
        } else {
            System.out.println("Order ID: " + orderId);
            System.out.println("Amount: " + amount);
            System.out.println("Method: " + method);
            showAlert("Payment successful!");
        }
    }

    @FXML
    public void handleBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerDashboard.fxml"));
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Failed to load dashboard.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

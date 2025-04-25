package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class InvoiceGenerationSceneController {

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
    private void handleGenerateInvoice() {
        String orderId = orderIdField.getText();
        String customerName = customerNameField.getText();
        String amount = amountField.getText();

        if (orderId.isEmpty() || customerName.isEmpty() || amount.isEmpty()) {
            System.out.println("Please fill all fields!");
            return;
        }


        System.out.println("Generating invoice for Order ID: " + orderId + ", Customer: " + customerName + ", Amount: " + amount);
    }

    @FXML
    private void handleBackToDashboard() {

        try {

            Stage stage = (Stage) btnBackToDashboard.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesExecutiveDashboard.fxml"));

            Scene dashboardScene = new Scene(loader.load());

            stage.setScene(dashboardScene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

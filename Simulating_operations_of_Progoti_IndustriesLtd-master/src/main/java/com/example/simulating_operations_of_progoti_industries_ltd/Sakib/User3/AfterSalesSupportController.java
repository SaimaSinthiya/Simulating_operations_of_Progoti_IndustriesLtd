package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    public void initialize() {

    }

    private void handleSubmitIssue() {
        String customerName = customerNameField.getText();
        String orderId = orderIdField.getText();
        String issueDescription = issueDescriptionField.getText();


        if (customerName.isEmpty() || orderId.isEmpty() || issueDescription.isEmpty()) {

            showAlert("Error", "Please fill in all fields.", AlertType.ERROR);
        } else {

            sendNotificationToManagingDirector(customerName, orderId, issueDescription);


            showAlert("Issue Submitted", "Your issue has been submitted successfully.", AlertType.INFORMATION);
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    private void sendNotificationToManagingDirector(String customerName, String orderId, String issueDescription) {

        System.out.println("Notification to Managing Director: ");
        System.out.println("Issue from Customer: " + customerName);
        System.out.println("Order ID: " + orderId);
        System.out.println("Issue Description: " + issueDescription);
    }

    private void showAlert(String title, String message, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void btnBackToDashboard(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    @FXML
    public void btnSubmitIssue(ActionEvent actionEvent) {
        handleSubmitIssue();
    }
}

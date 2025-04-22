package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerPlaceOrderController {

    @FXML
    private TextField productNameField;

    @FXML
    private TextField quantityField;

    @FXML
    private TextField addressField;

    @FXML
    private ComboBox<String> deliveryMethodComboBox;

    @FXML
    private Button placeOrderButton;

    @FXML
    private Button backButton;

    private static int orderCounter = 2001;

    @FXML
    public void initialize() {
        deliveryMethodComboBox.getItems().addAll("Home Delivery", "Pick-up");
    }

    @FXML
    public void handlePlaceOrder(ActionEvent event) {
        String productName = productNameField.getText();
        String quantity = quantityField.getText();
        String address = addressField.getText();
        String method = deliveryMethodComboBox.getValue();

        if (productName.isEmpty() || quantity.isEmpty() || address.isEmpty() || method == null) {
            showAlert("Please fill in all fields.");
        } else {
            String orderId = "ORD" + orderCounter++;
            System.out.println("Order Placed!");
            System.out.println("Order ID: " + orderId);
            System.out.println("Product: " + productName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Address: " + address);
            System.out.println("Method: " + method);

            showAlert("Order placed successfully!\nYour Order ID is: " + orderId);
            clearFields();
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
            showAlert("Unable to load dashboard.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Order Info");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearFields() {
        productNameField.clear();
        quantityField.clear();
        addressField.clear();
        deliveryMethodComboBox.getSelectionModel().clearSelection();
    }
}

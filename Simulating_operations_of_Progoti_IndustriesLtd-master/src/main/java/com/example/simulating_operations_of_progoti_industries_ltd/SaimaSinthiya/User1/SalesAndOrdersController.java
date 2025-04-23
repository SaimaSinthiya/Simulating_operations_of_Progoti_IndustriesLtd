package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesAndOrdersController {

    @FXML private TextField orderIdField;
    @FXML private TextField productNameField;
    @FXML private TextField quantityField;
    @FXML private TableView<OrderItem> orderTable;
    @FXML private TableColumn<OrderItem, String> orderIdColumn;
    @FXML private TableColumn<OrderItem, String> productNameColumn;
    @FXML private TableColumn<OrderItem, Integer> quantityColumn;

    private ObservableList<OrderItem> orderList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));


        orderTable.setItems(orderList);
    }

    @FXML
    private void addOrderOnAction(ActionEvent event) {
        String orderId = orderIdField.getText();
        String productName = productNameField.getText();
        String quantityText = quantityField.getText();

        if (orderId.isEmpty() || productName.isEmpty() || quantityText.isEmpty()) {
            showAlert("All fields are required.");
            return;
        }

        try {
            int quantity = Integer.parseInt(quantityText);
            OrderItem newOrder = new OrderItem(orderId, productName, quantity);
            orderList.add(newOrder);

            orderIdField.clear();
            productNameField.clear();
            quantityField.clear();
        } catch (NumberFormatException e) {
            showAlert("Quantity must be a number.");
        }
    }

    @FXML
    private void deleteOrderOnAction(ActionEvent event) {
        OrderItem selected = orderTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            orderList.remove(selected);
        } else {
            showAlert("Please select an order to delete.");
        }
    }

    @FXML
    private void backToDashboardOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagingDirectorDashBoard.fxml"));
            Stage stage = (Stage) orderTable.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Notice");
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}

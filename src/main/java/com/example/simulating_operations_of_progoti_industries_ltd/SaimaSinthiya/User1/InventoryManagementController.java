package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2.ProductItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class InventoryManagementController implements Initializable {

    @FXML
    private TextField productNameField;

    @FXML
    private TextField quantityField;

    @FXML
    private TableView<ProductItem> inventoryTable;

    @FXML
    private TableColumn<ProductItem, String> productNameColumn;

    @FXML
    private TableColumn<ProductItem, Integer> quantityColumn;

    private ObservableList<ProductItem> inventoryList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        inventoryTable.setItems(inventoryList);
    }

    @FXML
    private void addProductOnAction() {
        String name = productNameField.getText().trim();
        String quantityText = quantityField.getText().trim();

        if (name.isEmpty() || quantityText.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please fill in both fields.");
            return;
        }

        int quantity;
        try {
            quantity = Integer.parseInt(quantityText);
            if (quantity <= 0) {
                showAlert(Alert.AlertType.ERROR, "Input Error", "Quantity must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Quantity must be a valid number.");
            return;
        }

        inventoryList.add(new ProductItem(name, quantity));
        productNameField.clear();
        quantityField.clear();
    }

    @FXML
    private void removeProductOnAction() {
        ProductItem selected = inventoryTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            inventoryList.remove(selected);
        } else {
            showAlert(Alert.AlertType.WARNING, "No Selection", "Please select a product to remove.");
        }
    }

    @FXML
    private void backtoDashboardOnAction(ActionEvent event) {

        System.out.println("Back to dashboard button clicked.");

    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}

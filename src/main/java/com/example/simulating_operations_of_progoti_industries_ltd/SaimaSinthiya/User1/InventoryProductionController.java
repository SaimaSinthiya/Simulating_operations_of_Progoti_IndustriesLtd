package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryProductionController {

    @FXML private ComboBox<String> productTypeComboBox;
    @FXML private TextField productNameField;
    @FXML private TextField unitsProducedField;
    @FXML private TableView<Product> productionTable;
    @FXML private TableColumn<Product, String> productNameColumn;
    @FXML private TableColumn<Product, Integer> unitsProducedColumn;
    @FXML private TableColumn<Product, String> productTypeColumn;  // fx:id="unitsProducedColumn1" in FXML

    private ObservableList<Product> productList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set product types
        productTypeComboBox.getItems().addAll("Vehicle", "Machinery");

        // Set up columns
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        unitsProducedColumn.setCellValueFactory(new PropertyValueFactory<>("unitsProduced"));
        productTypeColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));

        // Bind list to table
        productionTable.setItems(productList);
    }

    @FXML
    private void addProductionOnAction() {
        String productType = productTypeComboBox.getValue();
        String productName = productNameField.getText().trim();
        String unitsStr = unitsProducedField.getText().trim();

        if (productType == null || productName.isEmpty() || unitsStr.isEmpty()) {
            showAlert("Validation Error", "All fields must be filled.");
            return;
        }


        if (productType.equals("Vehicle") && !productName.matches("[A-Za-z0-9 ]+")) {
            showAlert("Validation Error", "Vehicle name can only contain letters, numbers, and spaces.");
            return;
        }

        int units;
        try {
            units = Integer.parseInt(unitsStr);
            if (units <= 0) {
                showAlert("Validation Error", "Units must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Validation Error", "Units must be a number.");
            return;
        }


        Product product = new Product(productName, units, productType);
        productList.add(product);


        productNameField.clear();
        unitsProducedField.clear();
        productTypeComboBox.getSelectionModel().clearSelection();
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

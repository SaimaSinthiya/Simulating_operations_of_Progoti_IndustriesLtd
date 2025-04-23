package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class InventoryProductionController implements Initializable {

    @FXML
    private ComboBox<String> productTypeComboBox;

    @FXML
    private TextField productNameField;

    @FXML
    private TextField unitsProducedField;

    @FXML
    private TableView<Product> productionTable;

    @FXML
    private TableColumn<Product, String> productNameColumn;

    @FXML
    private TableColumn<Product, Integer> unitsProducedColumn;

    @FXML
    private TableColumn<Product, String> TypeColumn;

    private ObservableList<Product> productList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        productTypeComboBox.setItems(FXCollections.observableArrayList("Vehicle", "Machinery", "Electronic"));


        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        unitsProducedColumn.setCellValueFactory(new PropertyValueFactory<>("unitsProduced"));
        TypeColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));


        productionTable.setItems(productList);
    }

    @FXML
    private void addProductionOnAction() {
        String productType = productTypeComboBox.getValue();
        String productName = productNameField.getText().trim();
        String unitsProducedText = unitsProducedField.getText().trim();


        if (productType == null || productName.isEmpty() || unitsProducedText.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "All fields must be filled out.");
            return;
        }


        if (productType.equals("Vehicle") && !productName.matches("[A-Za-z0-9 ]+")) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Vehicle name must contain only letters and numbers.");
            return;
        }

        int units;
        try {
            units = Integer.parseInt(unitsProducedText);
            if (units <= 0) {
                showAlert(Alert.AlertType.ERROR, "Validation Error", "Units produced must be a positive number.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Units produced must be a valid number.");
            return;
        }


        Product newProduct = new Product(productName, units, productType);
        productList.add(newProduct);


        productNameField.clear();
        unitsProducedField.clear();
        productTypeComboBox.getSelectionModel().clearSelection();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

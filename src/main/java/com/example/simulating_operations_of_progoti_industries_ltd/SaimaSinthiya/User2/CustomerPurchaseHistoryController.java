package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerPurchaseHistoryController {

    @FXML
    private TableView<Purchase> purchaseHistoryTable;

    @FXML
    private TableColumn<Purchase, String> orderIdColumn;

    @FXML
    private TableColumn<Purchase, String> productNameColumn;

    @FXML
    private TableColumn<Purchase, String> purchaseDateColumn;

    @FXML
    private TableColumn<Purchase, String> amountColumn;

    @FXML
    private Button backButton;

    @FXML
    public void initialize() {

        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        purchaseDateColumn.setCellValueFactory(new PropertyValueFactory<>("purchaseDate"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));


        ObservableList<Purchase> purchaseList = FXCollections.observableArrayList(
                new Purchase("ORD1001", "Shampoo", "2025-04-15", "BDT 150"),
                new Purchase("ORD1002", "Toothpaste", "2025-04-14", "BDT 120"),
                new Purchase("ORD1003", "Soap", "2025-04-13", "BDT 50")
        );
        purchaseHistoryTable.setItems(purchaseList);
    }

    @FXML
    public void handleBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


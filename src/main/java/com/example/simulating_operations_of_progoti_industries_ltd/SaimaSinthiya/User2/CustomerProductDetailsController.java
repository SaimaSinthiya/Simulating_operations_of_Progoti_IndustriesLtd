package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerProductDetailsController {

    @FXML
    private ListView<String> productListView;

    @FXML
    private Button backButton;

    @FXML
    public void initialize() {

        ObservableList<String> products = FXCollections.observableArrayList(
                "Product 1 - Shampoo - BDT 150",
                "Product 2 - Soap - BDT 50",
                "Product 3 - Handwash - BDT 90",
                "Product 4 - Toothpaste - BDT 120"
        );
        productListView.setItems(products);
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

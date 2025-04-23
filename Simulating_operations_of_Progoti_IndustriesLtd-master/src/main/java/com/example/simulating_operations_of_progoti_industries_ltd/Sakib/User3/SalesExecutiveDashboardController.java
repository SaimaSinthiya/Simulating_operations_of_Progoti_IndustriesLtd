package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesExecutiveDashboardController {

    @FXML
    private Button btnViewSalesRecords;

    @FXML
    private Button btnManageCustomerOrders;

    @FXML
    private Button btnGenerateReports;

    @FXML
    private Button btnTrackInventory;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {
    }

    private void loadSceneWithTryCatch(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML: " + fxmlPath);
        }
    }

    @FXML
    public void goToSalesRecords(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesRecords.fxml", event);
    }

    @FXML
    public void goToCustomerOrders(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/CustomerOrders.fxml", event);
    }

    @FXML
    public void goToGenerateReports(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/GenerateReports.fxml", event);
    }

    @FXML
    public void goToTrackInventory(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/TrackInventory.fxml", event);
    }

    @FXML
    public void backToMainDashboard(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/MainDashboard.fxml", event);
    }
}

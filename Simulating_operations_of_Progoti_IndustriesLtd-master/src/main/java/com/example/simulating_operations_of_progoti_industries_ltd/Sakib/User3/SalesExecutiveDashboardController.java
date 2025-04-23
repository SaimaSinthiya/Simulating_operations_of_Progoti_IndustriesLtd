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

    }

    }

    private void handleManageCustomerOrders() {
        System.out.println("Managing Customer Orders...");
    @FXML
    public void goToCustomerOrders(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/CustomerOrders.fxml", event);
    }

    }

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Main Dashboard...");
    @FXML
    public void backToMainDashboard(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/MainDashboard.fxml", event);
    }
}

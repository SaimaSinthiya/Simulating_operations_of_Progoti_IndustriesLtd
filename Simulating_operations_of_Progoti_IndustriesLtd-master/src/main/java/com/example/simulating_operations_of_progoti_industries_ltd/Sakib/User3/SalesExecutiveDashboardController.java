package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

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
    private Button btnGenerateInvoice;

    @FXML
    private Button btnCustomerFeedback;

    @FXML
    private Button btnNotifications;

    @FXML
    private Button btnViewOrderHistory;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    private void handleViewSalesRecords() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesReportScene.fxml");
    }

    @FXML
    private void handleManageCustomerOrders() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/CustomerEntryController.fxml");
    }

    @FXML
    private void handleGenerateReports() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/GenerateReports.fxml");
    }

    @FXML
    private void handleTrackInventory() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/TrackInventory.fxml");
    }

    @FXML
    private void handleGenerateInvoice() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/InvoiceGenerationScene.fxml");
    }

    @FXML
    private void handleCustomerFeedback() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/CustomerFeedback.fxml");
    }

    @FXML
    private void handleNotifications() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/Notifications.fxml");
    }

    @FXML
    private void handleViewOrderHistory() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/OrderHistory.fxml");
    }

    @FXML
    private void handleBackToMainDashboard() {
        loadScene("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesExecutiveDashboard.fxml");
    }


    private void loadScene(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            Stage stage = (Stage) btnViewSalesRecords.getScene().getWindow(); // can use any button to get the stage
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading scene: " + fxmlPath);
            e.printStackTrace();
        }
    }
}

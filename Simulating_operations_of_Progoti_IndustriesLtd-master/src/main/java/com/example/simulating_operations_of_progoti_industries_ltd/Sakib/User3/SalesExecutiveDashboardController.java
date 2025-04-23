package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

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

    private void handleViewSalesRecords() {
        System.out.println("Navigating to Sales Records...");
    }

    private void handleManageCustomerOrders() {
        System.out.println("Managing Customer Orders...");
    }

    private void handleGenerateReports() {
        System.out.println("Generating Sales Reports...");
    }

    private void handleTrackInventory() {
        System.out.println("Tracking Inventory...");
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Main Dashboard...");
    }
}

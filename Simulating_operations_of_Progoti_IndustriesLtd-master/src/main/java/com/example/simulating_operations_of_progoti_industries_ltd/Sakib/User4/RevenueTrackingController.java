package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RevenueTrackingController {

    @FXML
    private TableView<Revenue> revenueTrackingTable;

    @FXML
    private TableColumn<Revenue, String> monthColumn;

    @FXML
    private TableColumn<Revenue, Double> totalRevenueColumn;

    @FXML
    private TableColumn<Revenue, Double> netProfitColumn;

    @FXML
    private TableColumn<Revenue, Double> growthRateColumn;

    @FXML
    private Button btnExportRevenue;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        totalRevenueColumn.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        netProfitColumn.setCellValueFactory(new PropertyValueFactory<>("netProfit"));
        growthRateColumn.setCellValueFactory(new PropertyValueFactory<>("growthRate"));

        btnExportRevenue.setOnAction(e -> handleExportRevenue());
        btnBackToDashboard.setOnAction(e -> handleBackToDashboard());
    }

    private void handleExportRevenue() {
        System.out.println("Exporting revenue data...");
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}

package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
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
    public void initialize() {
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        totalRevenueColumn.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        netProfitColumn.setCellValueFactory(new PropertyValueFactory<>("netProfit"));
        growthRateColumn.setCellValueFactory(new PropertyValueFactory<>("growthRate"));
    }

    private void handleExportRevenue() {

        if (revenueTrackingTable.getItems().isEmpty()) {
            System.out.println("No revenue data to export.");
        } else {
            System.out.println("Exporting revenue data...");

            for (Revenue revenue : revenueTrackingTable.getItems()) {
                System.out.println("Month: " + revenue.getMonth() + ", Total Revenue: " + revenue.getTotalRevenue() +
                        ", Net Profit: " + revenue.getNetProfit() + ", Growth Rate: " + revenue.getGrowthRate());
            }
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    @FXML
    public void exportRevenueButtonOnClick(ActionEvent actionEvent) {
        handleExportRevenue();
    }

    @FXML
    public void backToDashBoardButton(ActionEvent actionEvent) {
        handleBackToDashboard();
    }
}

package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialRecordsController {

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

    private void handleAddNewRecord() {
        String month = "";
        Double totalRevenue = 0.0;
        Double netProfit = 0.0;
        Double growthRate = 0.0;

        if (month.isEmpty() || totalRevenue <= 0 || netProfit <= 0 || growthRate <= 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Adding a new record for month: " + month);
    }

    private void handleUpdateRecord() {
        String month = "";
        Double totalRevenue = 0.0;
        Double netProfit = 0.0;
        Double growthRate = 0.0;

        if (month.isEmpty() || totalRevenue <= 0 || netProfit <= 0 || growthRate <= 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Updating record for month: " + month);
    }

    @FXML
    public void addNewRecordButtonOnClick(ActionEvent actionEvent) {
        handleAddNewRecord();
    }

    @FXML
    public void updateNewRecordButtonOnClick(ActionEvent actionEvent) {
        handleUpdateRecord();
    }
}

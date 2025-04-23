package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialRecordsController {

    @FXML

    @FXML
    private TableColumn<FinancialRecord, Double> amountColumn;

    @FXML
    private TableColumn<FinancialRecord, String> descriptionColumn;

    @FXML
    private Button btnAddNewRecord;

    @FXML

    @FXML
    public void initialize() {
        monthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        totalRevenueColumn.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        netProfitColumn.setCellValueFactory(new PropertyValueFactory<>("netProfit"));
        growthRateColumn.setCellValueFactory(new PropertyValueFactory<>("growthRate"));
    }

    private void handleAddNewRecord() {
        System.out.println("Adding a new financial record...");

    }

    private void handleUpdateRecord() {
        System.out.println("Updating financial record...");
        String month = "";
        Double totalRevenue = 0.0;
        Double netProfit = 0.0;
        Double growthRate = 0.0;

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    @FXML
    public void addNewRecordButtonOnClick(ActionEvent actionEvent) {
        handleAddNewRecord();
    }

    @FXML
    public void updateNewRecordButtonOnClick(ActionEvent actionEvent) {
        handleUpdateRecord();
    }
}

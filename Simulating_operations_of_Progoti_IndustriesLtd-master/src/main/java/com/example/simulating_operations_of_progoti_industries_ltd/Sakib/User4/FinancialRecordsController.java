package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialRecordsController {

    @FXML
    private TableView<FinancialRecord> financialRecordsTable;

    @FXML
    private TableColumn<FinancialRecord, String> recordIdColumn;

    @FXML
    private TableColumn<FinancialRecord, String> dateColumn;

    @FXML
    private TableColumn<FinancialRecord, String> typeColumn;

    @FXML
    private TableColumn<FinancialRecord, Double> amountColumn;

    @FXML
    private TableColumn<FinancialRecord, String> descriptionColumn;

    @FXML
    private Button btnAddNewRecord;

    @FXML
    private Button btnUpdateRecord;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

        recordIdColumn.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));


    }

    private void handleAddNewRecord() {
        System.out.println("Adding a new financial record...");

    }

    private void handleUpdateRecord() {
        System.out.println("Updating financial record...");

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    }
}

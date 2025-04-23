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
        // Set the cell value factory for each column using PropertyValueFactory
        recordIdColumn.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        // Set event handlers for buttons
        btnAddNewRecord.setOnAction(e -> handleAddNewRecord());
        btnUpdateRecord.setOnAction(e -> handleUpdateRecord());
        btnBackToDashboard.setOnAction(e -> handleBackToDashboard());
    }

    private void handleAddNewRecord() {
        System.out.println("Adding a new financial record...");
        // Implement logic to add a new financial record
    }

    private void handleUpdateRecord() {
        System.out.println("Updating financial record...");
        // Implement logic to update an existing financial record
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
        // Implement logic to go back to the Finance Department Head Dashboard
    }
}

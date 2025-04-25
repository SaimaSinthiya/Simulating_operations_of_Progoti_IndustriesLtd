package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

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

    // Initialize the TableView columns with property values from the FinancialRecord class
    @FXML
    public void initialize() {
        recordIdColumn.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));

        // Load financial records into the TableView
        loadFinancialRecords();
    }

    // Action for "Add New Record" button click
    @FXML
    public void addNewRecordButtonOnClick(ActionEvent actionEvent) {
        handleAddNewRecord();
    }

    // Action for "Update Record" button click
    @FXML
    public void updateRecordButtonOnClick(ActionEvent actionEvent) {
        handleUpdateRecord();
    }

    // Action for "Back to Dashboard" button click
    @FXML
    public void backToDashboardButtonOnClick(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    // Logic to handle adding a new financial record
    private void handleAddNewRecord() {
        System.out.println("Adding a new financial record...");
        // For now, we just print a message. You can open a form to add a new record.

        // Example: Open a new window or dialog for adding a record
        openAddRecordForm();
    }

    // Logic to handle updating an existing financial record
    private void handleUpdateRecord() {
        System.out.println("Updating financial record...");
        FinancialRecord selectedRecord = financialRecordsTable.getSelectionModel().getSelectedItem();
        if (selectedRecord != null) {
            // Update the selected record
            System.out.println("Selected record ID: " + selectedRecord.getRecordId());
            // You can open a form to update the record details here
        } else {
            System.out.println("No record selected to update.");
        }
    }

    // Logic to handle navigating back to the Dashboard
    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
        // Here you can load the main dashboard scene (if applicable)
        navigateBackToDashboard();
    }

    private void openAddRecordForm() {
                System.out.println("Opening form to add a new record...");

    }

    private void navigateBackToDashboard() {
        try {

            Stage stage = (Stage) btnBackToDashboard.getScene().getWindow();

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinanceDepartmentHeadDashBoard.fxml"));

            Scene dashboardScene = new Scene(loader.load());

            stage.setScene(dashboardScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFinancialRecords() {

        financialRecordsTable.getItems().clear();

        financialRecordsTable.getItems().add(new FinancialRecord("1", "2025-01-01", "Expense", 500.00, "Office Supplies"));
        financialRecordsTable.getItems().add(new FinancialRecord("2", "2025-01-02", "Income", 1000.00, "Sales Revenue"));
    }
}

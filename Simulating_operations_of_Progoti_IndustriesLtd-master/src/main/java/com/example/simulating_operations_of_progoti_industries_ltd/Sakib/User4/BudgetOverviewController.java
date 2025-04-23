package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class BudgetOverviewController {

    @FXML
    private TableView<?> budgetOverviewTable;

    @FXML
    private TableColumn<?, ?> departmentColumn;

    @FXML
    private TableColumn<?, ?> allocatedAmountColumn;

    @FXML
    private TableColumn<?, ?> usedAmountColumn;

    @FXML
    private Button btnAddNewBudget;

    @FXML
    private Button btnUpdateBudget;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        allocatedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("allocatedAmount"));
        usedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("usedAmount"));
    }

    private void handleAddNewBudget() {
        System.out.println("Adding a new budget...");

    }

    private void handleUpdateBudget() {
        System.out.println("Updating budget...");

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    }
}

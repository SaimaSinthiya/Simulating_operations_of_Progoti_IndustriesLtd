package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
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
    public void initialize() {
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        allocatedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("allocatedAmount"));
        usedAmountColumn.setCellValueFactory(new PropertyValueFactory<>("usedAmount"));
    }

    private void handleAddNewBudget() {
        String department = "";
        Double allocatedAmount = 0.0;
        Double usedAmount = 0.0;

        if (department.isEmpty() || allocatedAmount <= 0 || usedAmount < 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Adding a new budget for department: " + department);
    }

    private void handleUpdateBudget() {
        String department = "";
        Double allocatedAmount = 0.0;
        Double usedAmount = 0.0;

        if (department.isEmpty() || allocatedAmount <= 0 || usedAmount < 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Updating budget for department: " + department);
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    @FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    @FXML
    public void updateBudgetButton(ActionEvent actionEvent) {
        handleUpdateBudget();
    }

    @FXML
    public void addNewBudgetButton(ActionEvent actionEvent) {
        handleAddNewBudget();
    }
}

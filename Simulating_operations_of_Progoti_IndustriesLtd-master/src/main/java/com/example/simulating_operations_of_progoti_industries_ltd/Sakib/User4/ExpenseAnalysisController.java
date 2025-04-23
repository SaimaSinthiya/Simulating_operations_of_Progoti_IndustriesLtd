package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class ExpenseAnalysisController {

    @FXML
    private TableView<Expense> expenseAnalysisTable;

    @FXML
    private TableColumn<Expense, String> categoryColumn;

    @FXML
    private TableColumn<Expense, Double> amountColumn;

    @FXML
    private TableColumn<Expense, String> descriptionColumn;

    @FXML
    private Button addNewExpenseButton;

    @FXML
    private Button updateExpenseButton;

    @FXML
    public void initialize() {
        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    private void handleAddNewExpense() {
        String category = "";
        Double amount = 0.0;
        String description = "";

        if (category.isEmpty() || description.isEmpty() || amount <= 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Adding a new expense in category: " + category);
    }

    private void handleUpdateExpense() {
        String category = "";
        Double amount = 0.0;
        String description = "";

        if (category.isEmpty() || description.isEmpty() || amount <= 0) {
            System.out.println("Please fill in all fields correctly.");
            return;
        }

        System.out.println("Updating expense in category: " + category);
    }

    @FXML
    public void addNewExpenseButtonOnClick(ActionEvent actionEvent) {
        handleAddNewExpense();
    }

    @FXML
    public void updateExpenseButtonOnClick(ActionEvent actionEvent) {
        handleUpdateExpense();
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    @FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
        handleBackToDashboard();
    }
}

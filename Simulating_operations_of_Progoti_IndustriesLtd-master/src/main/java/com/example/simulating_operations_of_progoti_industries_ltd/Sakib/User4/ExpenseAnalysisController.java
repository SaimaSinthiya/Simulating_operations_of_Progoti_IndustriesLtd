package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

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
    private Button btnAddNewExpense;

    @FXML
    private Button btnUpdateExpense;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

        categoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));


        btnAddNewExpense.setOnAction(e -> handleAddNewExpense());
        btnUpdateExpense.setOnAction(e -> handleUpdateExpense());
        btnBackToDashboard.setOnAction(e -> handleBackToDashboard());
    }

    private void handleAddNewExpense() {
        System.out.println("Adding a new expense...");

    }

    private void handleUpdateExpense() {
        System.out.println("Updating expense...");

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    }
}

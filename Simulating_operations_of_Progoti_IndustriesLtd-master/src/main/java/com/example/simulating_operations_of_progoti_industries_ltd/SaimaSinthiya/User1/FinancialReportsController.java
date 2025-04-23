package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FinancialReportsController {

    @FXML
    private TableView<FinancialReport> financialReportTable;

    @FXML
    private TableColumn<FinancialReport, String> dateColumn;

    @FXML
    private TableColumn<FinancialReport, Double> totalRevenueColumn;

    @FXML
    private TableColumn<FinancialReport, Double> totalExpenseColumn;

    @FXML
    private TableColumn<FinancialReport, Double> netProfitColumn;

    private ObservableList<FinancialReport> financialReportList = FXCollections.observableArrayList();
    @FXML
    private Button generateReportButton1;
    @FXML
    private Button generateReportButton;

    @FXML
    public void initialize() {
        // Bind columns to model properties
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        totalRevenueColumn.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        totalExpenseColumn.setCellValueFactory(new PropertyValueFactory<>("totalExpense"));
        netProfitColumn.setCellValueFactory(new PropertyValueFactory<>("netProfit"));

        // Bind data list to table
        financialReportTable.setItems(financialReportList);
    }

    @FXML
    public void generateReportOnAction(ActionEvent event) {
        // Clear old data
        financialReportList.clear();

        // Add dummy report entries
        financialReportList.add(new FinancialReport("2025-01-01", 50000.00, 30000.00, 20000.00));
        financialReportList.add(new FinancialReport("2025-02-01", 55000.00, 32000.00, 23000.00));
        financialReportList.add(new FinancialReport("2025-03-01", 60000.00, 35000.00, 25000.00));

        // Show confirmation
        showAlert("Report Generated", "The financial report has been generated successfully.");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void backButton(ActionEvent actionEvent) {
    }
}

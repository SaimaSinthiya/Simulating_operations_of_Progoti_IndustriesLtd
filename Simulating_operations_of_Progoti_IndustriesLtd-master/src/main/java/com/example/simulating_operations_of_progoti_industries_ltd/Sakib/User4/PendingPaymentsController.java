package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PendingPaymentsController {

    @FXML
    private TableView<Payment> pendingPaymentsTable;

    @FXML
    private TableColumn<Payment, String> paymentIdColumn;

    @FXML
    private TableColumn<Payment, String> dueDateColumn;

    @FXML
    private TableColumn<Payment, Double> amountColumn;

    @FXML
    private TableColumn<Payment, String> statusColumn;

    @FXML
    public void initialize() {
        paymentIdColumn.setCellValueFactory(new PropertyValueFactory<>("paymentId"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        amountColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    private void handleMarkAsPaid() {

        Payment selectedPayment = pendingPaymentsTable.getSelectionModel().getSelectedItem();

        if (selectedPayment == null) {
            System.out.println("No payment selected. Please select a payment to mark as paid.");
        } else {

            selectedPayment.setStatus("Paid");
            System.out.println("Payment " + selectedPayment.getPaymentId() + " has been marked as paid.");

        }
    }

    private void handleExportPayments() {
            System.out.println("Exporting payments...");

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    }
}

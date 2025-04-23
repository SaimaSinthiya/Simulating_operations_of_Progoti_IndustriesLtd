package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
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

        if (pendingPaymentsTable.getItems().isEmpty()) {
            System.out.println("No payments to export.");
        } else {
            System.out.println("Exporting payments...");

            for (Payment payment : pendingPaymentsTable.getItems()) {
                System.out.println("Payment ID: " + payment.getPaymentId() + ", Amount: " + payment.getAmount() + ", Status: " + payment.getStatus());
            }
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    @FXML
    public void backToDashboardButton(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    @FXML
    public void exportPaymentsButton(ActionEvent actionEvent) {
        handleExportPayments();
    }

    @FXML
    public void markAsPaidButton(ActionEvent actionEvent) {
        handleMarkAsPaid();
    }
}

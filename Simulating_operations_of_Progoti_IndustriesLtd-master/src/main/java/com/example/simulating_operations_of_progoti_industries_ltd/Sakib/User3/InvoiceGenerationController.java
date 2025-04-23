package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.*;

public class InvoiceGenerationController {

    @FXML
    private TextField orderIdField;

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField amountField;

    @FXML
    private Button btnGenerateInvoice;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleGenerateInvoice() {
        String orderId = orderIdField.getText();
        String customerName = customerNameField.getText();
        String amount = amountField.getText();

        if (orderId.isEmpty() || customerName.isEmpty() || amountText.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            System.out.println("Invoice generated for Order ID: " + orderId);
            System.out.println("Customer Name: " + customerName);
            System.out.println("Amount: " + amount);

            saveInvoiceToBinaryFile(orderId, customerName, amount);
            saveInvoiceToTextFile(orderId, customerName, amount);

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount entered. Please enter a valid number.");
        }
    }

    private void saveInvoiceToBinaryFile(String orderId, String customerName, double amount) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Invoices.bin", true))) {
            Invoice invoice = new Invoice(orderId, customerName, amount);
            oos.writeObject(invoice);
            System.out.println("Invoice saved to binary file.");
        } catch (IOException e) {
            System.out.println("Error saving invoice to binary file: " + e.getMessage());
        }
    }

    private void saveInvoiceToTextFile(String orderId, String customerName, double amount) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Invoices.txt", true))) {
            writer.println("Order ID: " + orderId);
            writer.println("Customer Name: " + customerName);
            writer.println("Amount: " + amount);
            writer.println("-----------------------------");
            System.out.println("Invoice saved to text file.");
        } catch (IOException e) {
            System.out.println("Error saving invoice to text file: " + e.getMessage());
        }
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}

    @FXML
    public void generateInvoiceButtonOnClick(ActionEvent actionEvent) {
        handleGenerateInvoice();
    }

    @FXML
    public void backToDashboardButtonOnClick(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    private static class Invoice implements Serializable {
        private String orderId;
        private String customerName;
        private double amount;

        public Invoice(String orderId, String customerName, double amount) {
            this.orderId = orderId;
            this.customerName = customerName;
            this.amount = amount;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getCustomerName() {
            return customerName;
        }

        public double getAmount() {
            return amount;
        }
    }
}

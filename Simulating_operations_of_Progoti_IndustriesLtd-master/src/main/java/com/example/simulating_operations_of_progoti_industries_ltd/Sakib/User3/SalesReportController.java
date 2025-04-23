package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3.SalesRecord;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.List;

public class SalesReportController {

    @FXML
    private TableView<SalesRecord> salesReportTable;

    @FXML
    private TableColumn<SalesRecord, String> orderIdColumn;

    @FXML
    private TableColumn<SalesRecord, String> customerNameColumn;

    @FXML
    private TableColumn<SalesRecord, Double> totalAmountColumn;

    @FXML
    private TableColumn<SalesRecord, String> statusColumn;

    @FXML
    private Button btnGenerateReport;

    @FXML
    private Button btnExportReport;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        totalAmountColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    private void loadSceneWithTryCatch(String fxmlPath) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) salesReportTable.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML: " + fxmlPath);
        }
    }

    private void handleExportReport() {
        List<SalesRecord> salesRecords = salesReportTable.getItems();
        saveReport(salesRecords);
    }

    private void saveReport(List<SalesRecord> salesRecords) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SalesReportData.bin"));
             PrintWriter writer = new PrintWriter(new FileWriter("SalesReportData.txt"))) {

            for (SalesRecord record : salesRecords) {
                               oos.writeObject(record);

                                writer.println("Order ID: " + record.getOrderId());
                writer.println("Customer Name: " + record.getCustomerName());
                writer.println("Total Amount: " + record.getTotalAmount());
                writer.println("Status: " + record.getStatus());
                writer.println("-----------------------------");
            }

            System.out.println("Sales report saved to both binary and text files.");
        } catch (IOException e) {
            System.out.println("Error saving sales report: " + e.getMessage());
        }
    }
    @FXML
    public void generateReportButtonOnClick() {
        System.out.println("Generating Sales Report...");
    }

    @FXML
    public void exportReportButtonOnClick() {
        handleExportReport();
    }

    @FXML
    public void backToDashboardButtonOnClick() {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/MainDashboard.fxml");
    }
}

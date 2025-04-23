package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class AuditReportsController {

    @FXML
    private TableView<?> auditReportsTable;

    @FXML
    private TableColumn<?, ?> reportIdColumn;

    @FXML
    private TableColumn<?, ?> periodColumn;

    @FXML
    private TableColumn<?, ?> summaryColumn;

    @FXML
    private Button btnGenerateNewReport;

    @FXML
    private Button btnExportReport;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

        btnGenerateNewReport.setOnAction(e -> handleGenerateNewReport());
        btnExportReport.setOnAction(e -> handleExportReport());
        btnBackToDashboard.setOnAction(e -> handleBackToDashboard());
    }

    private void handleGenerateNewReport() {
        System.out.println("Generating new audit report...");

    }

    private void handleExportReport() {
        System.out.println("Exporting the audit report...");

    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");

    }
}

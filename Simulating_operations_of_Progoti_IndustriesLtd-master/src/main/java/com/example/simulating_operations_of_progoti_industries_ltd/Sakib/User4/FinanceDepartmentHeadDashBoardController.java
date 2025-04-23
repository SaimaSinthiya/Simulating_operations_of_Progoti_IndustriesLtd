package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class FinanceDepartmentHeadDashBoardController {

    @FXML
    private Button btnViewFinancialRecords;

    @FXML
    private Button btnManageBudget;

    @FXML
    private Button btnProcessPayments;

    @FXML
    private Button btnTrackRevenue;

    @FXML
    private Button btnGenerateAuditReports;

    @FXML
    private Button btnAnalyzeExpenses;

    @FXML
    private Button btnManageUserPermissions;

    @FXML
    private Button btnPerformRiskAssessment;

    @FXML
    private Button btnPerformRiskAssessment1; // This is the "signout" button

    @FXML
    public void initialize() {

    }

    private void handleViewFinancialRecords() {
        System.out.println("Navigating to Financial Records...");
        // Load FinancialRecord scene
    }

    private void handleManageBudget() {
        System.out.println("Navigating to Budget Management...");
        // Load Budget scene
    }

    private void handleProcessPayments() {
        System.out.println("Navigating to Payments...");
        // Load Payments scene
    }

    private void handleTrackRevenue() {
        System.out.println("Navigating to Revenue Tracking...");
        // Load Revenue scene
    }

    private void handleGenerateAuditReports() {
        System.out.println("Navigating to Audit Reports...");
        // Load Audit Reports scene
    }

    private void handleAnalyzeExpenses() {
        System.out.println("Navigating to Expense Analysis...");
        // Load Expense Analysis scene
    }

    private void handleManageUserPermissions() {
        System.out.println("Navigating to User Permissions...");
        // Load User Permissions scene
    }

    private void handlePerformRiskAssessment() {
        System.out.println("Navigating to Risk Assessment...");
        // Load Risk Assessment scene
    }

    @FXML
    private void signout(ActionEvent event) {
        System.out.println("Signing out...");
        // Add sign-out logic and go back to login screen
    }
}

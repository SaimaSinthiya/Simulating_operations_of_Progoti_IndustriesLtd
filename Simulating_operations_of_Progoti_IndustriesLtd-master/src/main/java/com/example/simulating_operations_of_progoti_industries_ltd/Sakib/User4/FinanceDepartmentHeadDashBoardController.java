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

        }


    private void handleProcessPayments() {
        System.out.println("Navigating to Payments...");

    @FXML
    public void goToFinancialRecords(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinancialRecords.fxml", event);
    }

    @FXML
    public void goToBudgetManagement(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ManageBudget.fxml", event);
    }

    private void handleGenerateAuditReports() {
        System.out.println("Navigating to Audit Reports...");

    @FXML
    public void goToRevenueTracking(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/TrackRevenue.fxml", event);
    }

    private void handleAnalyzeExpenses() {
        System.out.println("Navigating to Expense Analysis...");

    }

    @FXML
    public void goToExpenseAnalysis(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/AnalyzeExpenses.fxml", event);
    }

    private void handlePerformRiskAssessment() {
        System.out.println("Navigating to Risk Assessment...");

    }

    @FXML
    public void goToRiskAssessment(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/PerformRiskAssessment.fxml", event);
    }

    @FXML
    public void signOut(ActionEvent event) {
        System.out.println("Signing out...");
    }
}

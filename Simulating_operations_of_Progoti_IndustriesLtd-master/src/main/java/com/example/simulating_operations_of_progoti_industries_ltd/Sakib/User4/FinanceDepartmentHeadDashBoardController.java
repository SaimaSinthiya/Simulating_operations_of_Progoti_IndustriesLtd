package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FinanceDepartmentHeadDashBoardController {

    // Additional buttons you mentioned later
    @FXML
    private Button btnBackToDashboard;

    @FXML
    private Button btnViewBudget;

    @FXML
    private Button btnManagePayroll;

    @FXML
    private Button btnAllocateBudget;

    @FXML
    private Button btnViewDepartmentExpenditure;

    @FXML
    private Button btnTrackExpenses;

    @FXML
    private Button btnGenerateFinancialReport;

    @FXML
    private Button btnApproveTransactions;

    @FXML
    private Button btnFinancialNotifications;

    @FXML
    public void initialize() {
    }

    @Deprecated
    public void goToFinancialRecords(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinancialRecords.fxml", event);
    }

    @Deprecated
    public void goToBudgetManagement(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/BudgetOverview.fxml", event);
    }

    @Deprecated
    public void goToProcessPayments(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ProcessPayments.fxml", event);
    }

    @Deprecated
    public void goToRevenueTracking(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/TrackRevenue.fxml", event);
    }

    @Deprecated
    public void goToAuditReports(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/GenerateAuditReports.fxml", event);
    }

    @Deprecated
    public void goToExpenseAnalysis(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/AnalyzeExpenses.fxml", event);
    }

    @Deprecated
    public void goToUserPermissions(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ManageUserPermissions.fxml", event);
    }

    @Deprecated
    public void goToRiskAssessment(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/PerformRiskAssessment.fxml", event);
    }

    @Deprecated
    public void signOut(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Login/LoginScene.fxml", event);
    }

    @Deprecated
    public void goToDashboard(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Dashboard/MainDashboard.fxml", event);
    }


    private void loadSceneWithTryCatch(String fxmlPath, ActionEvent event) {
        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource(fxmlPath));
            javafx.scene.Parent root = loader.load();
            javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error loading: " + fxmlPath);
        }
    }
}

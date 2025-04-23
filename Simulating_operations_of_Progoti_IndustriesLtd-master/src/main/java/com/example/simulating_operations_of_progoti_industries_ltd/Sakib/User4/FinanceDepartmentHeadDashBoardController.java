package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import java.io.IOException;

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

    private void loadSceneWithTryCatch(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.out.println("Error loading FXML: " + fxmlPath);
        }
    }

    @FXML
    public void goToFinancialRecords(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinancialRecords.fxml", event);
    }

    @FXML
    public void goToBudgetManagement(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ManageBudget.fxml", event);
    }

    @FXML
    public void goToPayments(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ProcessPayments.fxml", event);
    }

    @FXML
    public void goToRevenueTracking(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/TrackRevenue.fxml", event);
    }

    @FXML
    public void goToAuditReports(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/GenerateAuditReports.fxml", event);
    }

    @FXML
    public void goToExpenseAnalysis(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/AnalyzeExpenses.fxml", event);
    }

    @FXML
    public void goToUserPermissions(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/ManageUserPermissions.fxml", event);
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

package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.HashSet;
import java.util.Set;

public class RiskAnalysisController {

    @FXML
    private TableView<RiskAssessment> riskAnalysisTable;

    @FXML
    private TableColumn<RiskAssessment, String> riskIdColumn;

    @FXML
    private TableColumn<RiskAssessment, String> descriptionColumn;

    @FXML
    private TableColumn<RiskAssessment, String> riskLevelColumn;

    @FXML
    private TableColumn<RiskAssessment, String> mitigationPlanColumn;

    @FXML
    public void initialize() {
        riskIdColumn.setCellValueFactory(new PropertyValueFactory<>("riskId"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        riskLevelColumn.setCellValueFactory(new PropertyValueFactory<>("riskLevel"));
        mitigationPlanColumn.setCellValueFactory(new PropertyValueFactory<>("mitigationPlan"));
    }

    private void handleAddNewRisk() {
        String riskId = "";
        String description = "";
        String riskLevel = "";
        String mitigationPlan = "";

        if (riskId.isEmpty() || description.isEmpty() || riskLevel.isEmpty() || mitigationPlan.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }


        Set<String> validRiskLevels = new HashSet<>();
        validRiskLevels.add("Low");
        validRiskLevels.add("Medium");
        validRiskLevels.add("High");

        if (!validRiskLevels.contains(riskLevel)) {
            System.out.println("Invalid risk level. Please select a valid risk level (Low, Medium, High).");
            return;
        }

        System.out.println("Adding a new risk with ID: " + riskId);
    }

    private void handleUpdateRisk() {
        String riskId = "";
        String description = "";
        String riskLevel = "";
        String mitigationPlan = "";

        if (riskId.isEmpty() || description.isEmpty() || riskLevel.isEmpty() || mitigationPlan.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }


        Set<String> validRiskLevels = new HashSet<>();
        validRiskLevels.add("Low");
        validRiskLevels.add("Medium");
        validRiskLevels.add("High");

        if (!validRiskLevels.contains(riskLevel)) {
            System.out.println("Invalid risk level. Please select a valid risk level (Low, Medium, High).");
            return;
        }

        System.out.println("Updating risk with ID: " + riskId);
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }

    @FXML
    public void backToDashBoardButtonOnClick(ActionEvent actionEvent) {
        handleBackToDashboard();
    }

    @FXML
    public void addNewRiskButtonOnClick(ActionEvent actionEvent) {
        handleAddNewRisk();
    }

    @FXML
    public void updateRiskButtonOnClick(ActionEvent actionEvent) {
        handleUpdateRisk();
    }
}

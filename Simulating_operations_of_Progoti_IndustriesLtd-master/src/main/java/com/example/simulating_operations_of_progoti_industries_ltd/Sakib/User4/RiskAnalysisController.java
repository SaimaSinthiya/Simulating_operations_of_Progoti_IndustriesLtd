package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private Button btnAddNewRisk;

    @FXML
    private Button btnUpdateRisk;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {
        riskIdColumn.setCellValueFactory(new PropertyValueFactory<>("riskId"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        riskLevelColumn.setCellValueFactory(new PropertyValueFactory<>("riskLevel"));
        mitigationPlanColumn.setCellValueFactory(new PropertyValueFactory<>("mitigationPlan"));


    }

    private void handleAddNewRisk() {
        System.out.println("Adding a new risk...");
    }

    private void handleUpdateRisk() {
        System.out.println("Updating risk...");
    }

    private void handleBackToDashboard() {
        System.out.println("Navigating back to Dashboard...");
    }
}

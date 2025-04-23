package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagingDirectorDashBoardFxmlController {

    private ManagingDirector user;

    @FXML private Label welcomeLabel;


    public void setter(ManagingDirector user) {
        this.user = user;
        setWelcomeText(user.getName());
        if (user != null) {
            System.out.println("Managing Director Name: " + user.getName());
        } else {
            System.out.println("User object is null");
        }
    }




    private void setWelcomeText(String name) {
        welcomeLabel.setText("Welcome, " + name + "!");
    }

    @FXML
    void goToBusinessOverview(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/BusinessOverview.fxml", event);
    }

    @FXML
    void goToInventoryProduction(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/InventoryProduction.fxml", event);
    }

    @FXML
    void goToEmployeeManagement(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/EmployeeManagement.fxml", event);
    }

    @FXML
    void goToInventoryManagement(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/InventoryManagement.fxml", event);
    }

    @FXML
    void goToFinancialReports(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/FinancialReports.fxml", event);
    }

    @FXML
    void goToSalesAndOrders(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/SalesAndOrders.fxml", event);
    }

    @FXML
    void goToNotifications(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Notifications.fxml", event);
    }

    @FXML
    void goToCustomerFeedback(ActionEvent event) {
        loadSceneWithTryCatch("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/CustomerFeedback.fxml", event);
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
}
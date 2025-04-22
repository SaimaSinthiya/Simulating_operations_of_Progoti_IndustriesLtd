package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagingDirectorDashBoardFxmlController {

    // Instance of ManagingDirector
    private ManagingDirector user;
    @javafx.fxml.FXML
    private Label welcomeLabel;

    // Setter method to assign ManagingDirector object
    public void setter(ManagingDirector md) {
        this.user = md;
    }

    // Initialize method - can be used to set up any initial UI components if needed
    @javafx.fxml.FXML
    public void initialize() {
        if (this.user != null) {
            System.out.println("ManagingDirector User: " + this.user.getName());  // Example of debugging initialization
        } else {
            System.out.println("User is not set yet.");
        }
    }

    // Navigating to Business Overview screen
    @javafx.fxml.FXML
    public void goToBusinessOverview(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal1_BusinessOverview/BusinessOverview.fxml"));
        Parent root = loader.load();

        // Get the controller for BusinessOverview
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.BusinessOverviewController controller = loader.getController();

        // Pass the ManagingDirector user to BusinessOverviewController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in BusinessOverview screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void goToEmployeeManagement(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToInventoryManagement(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToNotifications(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToCustomerFeedback(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void goToSalesAndOrders(ActionEvent actionEvent) {
    }

    // Navigating to Inventory Production screen
    /*@javafx.fxml.FXML
    public void goToInventoryProduction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal2_InventoryProduction/InventoryProduction.fxml"));
        Parent root = loader.load();

        // Get the controller for InventoryProduction
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal2_InventoryProduction.InventoryProductionController controller = loader.getController();

        // Pass the ManagingDirector user to InventoryProductionController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in InventoryProduction screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Employee Management screen
    @javafx.fxml.FXML
    public void goToEmployeeManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal3_EmployeeManagement/EmployeeManagement.fxml"));
        Parent root = loader.load();

        // Get the controller for EmployeeManagement
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.EmployeeManagementController controller = loader.getController();

        // Pass the ManagingDirector user to EmployeeManagementController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in EmployeeManagement screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Inventory Management screen
    @javafx.fxml.FXML
    public void goToInventoryManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal4_InventoryManagement/InventoryManagement.fxml"));
        Parent root = loader.load();

        // Get the controller for InventoryManagement
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal4_InventoryManagement.InventoryManagementController controller = loader.getController();

        // Pass the ManagingDirector user to InventoryManagementController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in InventoryManagement screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Financial Reports screen
    @javafx.fxml.FXML
    public void goToFinancialReports(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal5_FinancialReports/FinancialReports.fxml"));
        Parent root = loader.load();

        // Get the controller for FinancialReports
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal5_FinancialReports.FinancialReportsController controller = loader.getController();

        // Pass the ManagingDirector user to FinancialReportsController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in FinancialReports screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Sales And Orders screen
    @javafx.fxml.FXML
    public void goToSalesAndOrders(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal6_SalesAndOrders/SalesAndOrders.fxml"));
        Parent root = loader.load();

        // Get the controller for SalesAndOrders
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal6_SalesAndOrders.SalesAndOrdersController controller = loader.getController();

        // Pass the ManagingDirector user to SalesAndOrdersController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in SalesAndOrders screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Notifications screen
    @javafx.fxml.FXML
    public void goToNotifications(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal7_Notifications/Notifications.fxml"));
        Parent root = loader.load();

        // Get the controller for Notifications
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal7_Notifications.NotificationsController controller = loader.getController();

        // Pass the ManagingDirector user to NotificationsController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in Notifications screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Navigating to Customer Feedback screen
    @javafx.fxml.FXML
    public void goToCustomerFeedback(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/Goal8_CustomerFeedback/CustomerFeedback.fxml"));
        Parent root = loader.load();

        // Get the controller for CustomerFeedback
        com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.Goal8_CustomerFeedback.CustomerFeedbackController controller = loader.getController();

        // Pass the ManagingDirector user to CustomerFeedbackController
        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("User is null in CustomerFeedback screen");
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.show();
    }

    // Sign Out action
    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Login/LoginScene.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        Stage stage = (Stage) (((Node) actionEvent.getSource()).getScene().getWindow());
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }*/
}

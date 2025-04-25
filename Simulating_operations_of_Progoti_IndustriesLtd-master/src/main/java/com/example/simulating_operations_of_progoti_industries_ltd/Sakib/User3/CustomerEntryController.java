package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerEntryController {

    @FXML
    private TextField customerNameField;

    @FXML
    private TextField customerEmailField;

    @FXML
    private TextField customerPhoneField;

    @FXML
    private Button btnSubmitCustomer;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleSubmitCustomer() {
        String customerName = customerNameField.getText();
        String customerEmail = customerEmailField.getText();
        String customerPhone = customerPhoneField.getText();

        if (!customerName.isEmpty() && !customerEmail.isEmpty() && !customerPhone.isEmpty()) {
            System.out.println("Customer Info Submitted:");
            System.out.println("Name: " + customerName);
            System.out.println("Email: " + customerEmail);
            System.out.println("Phone: " + customerPhone);
        } else {
            System.out.println("Please fill in all fields.");
        }
    }

    @FXML
    private void back(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesExecutiveDashboard.fxml"));

            Parent root = loader.load();

            // Optional: send user data to dashboard controller
            // ManagingDirectorDashboardController controller = loader.getController();
            // controller.setUser(this.user); // if you have a user to pass

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

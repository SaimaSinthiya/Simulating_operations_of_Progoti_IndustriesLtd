package com.example.simulating_operations_of_progoti_industries_ltd.Login;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {



    @FXML
    private ComboBox<String> designation_ComboBox;
    @FXML
    private PasswordField passTextField;
    @FXML
    private PasswordField UserIdTextField;
    @FXML
    private PasswordField pass_textField;
    @FXML
    private TextField userID_textField;

    @FXML
    public void initialize() {
        designation_ComboBox.getItems().addAll(
                "Managing Director",
                "Customer",
                "Sales Executive",
                "Finance Department Head",
                "Production Manager"
        );
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void logIn_button(ActionEvent event) {
        String userID = UserIdTextField.getText().trim();
        String password = passTextField.getText().trim();
        String designation = designation_ComboBox.getValue();

        if (userID.isEmpty() || password.isEmpty() || designation == null) {
            showError("Please fill in all fields.");
            return;
        }

        try {
            int id = Integer.parseInt(userID);
            if (userID.length() != 3) {
                showError("User ID must be exactly 3 digits.");
                return;
            }
        } catch (NumberFormatException e) {
            showError("User ID must contain only numbers.");
            return;
        }

        if (password.length() < 6) {
            showError("Password must be at least 6 characters long.");
            return;
        }


        boolean matched = false;
        switch (designation) {
            case "Managing Director":
                matched = userID.equals("123") && password.equals("mdpass");
                break;
            case "Customer":
                matched = userID.equals("345") && password.equals("custpass");
                break;
            case "Sales Executive":
                matched = userID.equals("456") && password.equals("salepass");
                break;
            case "Finance Department Head":
                matched = userID.equals("789") && password.equals("finpass");
                break;
            case "Production Manager":
                matched = userID.equals("321") && password.equals("propass");
                break;
            default:
                showError("Invalid designation.");
                return;
        }

        if (matched) {
            try {
                Parent root = null;
                switch (designation) {
                    case "Managing Director":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/ManagingDirectorDashBoard.fxml"));
                        break;
                    case "Customer":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerDashboard.fxml"));
                        break;
                    case "Sales Executive":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesExecutiveDashboard.fxml"));
                        break;
                    case "Finance Department Head":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User4/FinanceDashboard.fxml"));
                        break;
                    case "Production Manager":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/nafiur/productionManagerView.fxml"));
                        break;
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                showError("Unable to load dashboard.");
            }
        } else {
            showError("Invalid ID or password for " + designation + ".");
        }
    }

    @FXML
    public void createNewUser_Button(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Login/CreateAccount.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showError("Unable to open account creation page.");
        }
    }
}
package com.example.simulating_operations_of_progoti_industries_ltd.Login;

/*import  com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.ManagingDirector;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class LoginSceneFxmlController {

    @javafx.fxml.FXML
    private TextField userID_textField;

    @javafx.fxml.FXML
    private ComboBox<String> designation_ComboBox;

    @javafx.fxml.FXML
    private PasswordField pass_textField;

    ManagingDirector managingDirector;
    Customer customer;

    @javafx.fxml.FXML
    public void initialize() {
        designation_ComboBox.getItems().addAll("Managing Director", "Customer", "Sales Executive", "Finance Department Head");
        managingDirector = new ManagingDirector(1, "Saima", "saima@progoti.com", "01622334455", "admin123","asd","asdfg",2);
        customer = new Customer(2, "John Doe", "john.doe@gmail.com", "01775566788", "customer123");*/

/*import javafx.event.ActionEvent;
import javafx.scene.Scene;

import java.io.IOException;}

    public void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Login Error");
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void logIn_button(ActionEvent actionEvent) {
        try {
            String password = pass_textField.getText();
            String userID = userID_textField.getText();
            String designation = designation_ComboBox.getSelectionModel().getSelectedItem();
            boolean verified = false;

            // Debugging logs
            System.out.println("UserID: " + userID);
            System.out.println("Password: " + password);
            System.out.println("Designation: " + designation);

            List<Object> users = new ArrayList<>();
            File file = new File("DataStore/UserData.bin");

            if (file.exists()) {
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                    users = (List<Object>) ois.readObject();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                    showError("Unable to read user data.");
                    return;
                }
            }

            for (Object userObj : users) {
                if (userObj instanceof ManagingDirector) {
                    ManagingDirector user = (ManagingDirector) userObj;
                    if (String.valueOf(user.getUserID()).equals(userID) && user.getPassword().equals(password) && user.getDesignation().equals(designation)) {
                        verified = true;
                        break;
                    }
                } else if (userObj instanceof Customer) {
                    Customer user = (Customer) userObj;
                    if (String.valueOf(user.getUserID()).equals(userID) && user.getPassword().equals(password) && user.getDesignation().equals(designation)) {
                        verified = true;
                        break;
                    }
                }
            }

            if (verified) {
                Parent root = null;
                switch (designation) {
                    case "Managing Director":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/User1_ManagingDirector/Profile/ManagingDirectorDashboard.fxml"));
                        break;
                    case "Customer":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/User1_ManagingDirector/Profile/CustomerDashboard.fxml"));
                        break;
                    case "Sales Executive":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SalesExecutive/SalesExecutiveDashboard.fxml"));
                        break;
                    case "Finance Department Head":
                        root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/FinanceDepartmentHead/FinanceDepartmentHeadDashboard.fxml"));
                        break;
                    default:
                        showError("Invalid designation.");
                        return;
                }
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } else {
                showError("Invalid credentials. Please try again.");
            }
        } catch (NumberFormatException e) {
            showError("User ID must be a number.");
        } catch (IOException e) {
            e.printStackTrace();
            showError("Unable to load the next page.");
        }
    }

    @javafx.fxml.FXML
    public void createNewUser_Button(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/CreateAccount.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/

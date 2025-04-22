package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerSupportController {

    @FXML
    private Label supportTitle;

    @FXML
    private Label queryLabel;

    @FXML
    private TextArea queryTextArea;

    @FXML
    private Button submitQueryButton;

    @FXML
    private Button backButton;

    @FXML
    public void handleSubmitQuery(ActionEvent event) {
        String query = queryTextArea.getText();

        if (query.isEmpty()) {
            System.out.println("Please enter a query before submitting.");
        } else {
            System.out.println("Submitted Query: " + query);
            System.out.println("Your query has been submitted successfully.");
        }
    }

    @FXML
    public void handleBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CustomerDashboard.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

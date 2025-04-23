package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

public class TestDriveSceneController {

    @FXML
    private TextArea customerNotesField;

    @FXML
    private DatePicker testDriveDatePicker;

    @FXML
    private Button btnBookTestDrive;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleBookTestDrive() {
        String notes = customerNotesField.getText();
        String testDriveDate = testDriveDatePicker.getValue() != null ? testDriveDatePicker.getValue().toString() : "Not Selected";

        if (!testDriveDate.equals("Not Selected")) {
            System.out.println("Test Drive booked for date: " + testDriveDate);
            System.out.println("Additional Notes: " + notes);
        } else {
            System.out.println("Please select a test drive date.");
        }
    }

    @FXML
    private void back() {
        System.out.println("Navigating back to Dashboard...");

    }
}

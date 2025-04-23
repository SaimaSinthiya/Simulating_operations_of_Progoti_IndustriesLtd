package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class SelectVehicleSceneController{

    @FXML
    private ListView<String> vehicleListView;

    @FXML
    private Button btnSelectVehicle;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {

    }

    private void handleSelectVehicle() {
        String selectedVehicle = vehicleListView.getSelectionModel().getSelectedItem();
        if (selectedVehicle != null) {
            System.out.println("Selected Vehicle: " + selectedVehicle);
        } else {
            System.out.println("Please select a vehicle.");
        }
    }

    @FXML
    private void back() {
        System.out.println("Navigating back to Dashboard...");

    }
}

package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

public class CustomerNotificationController {


    @FXML
    private Text notificationTitle;

    @FXML
    private ListView<String> notificationsList;


    @FXML
    public void handleBack(ActionEvent event) {

        System.out.println("Back button clicked");


    }


    public void initialize() {

        notificationsList.getItems().addAll("Notification 1", "Notification 2", "Notification 3");
    }
}

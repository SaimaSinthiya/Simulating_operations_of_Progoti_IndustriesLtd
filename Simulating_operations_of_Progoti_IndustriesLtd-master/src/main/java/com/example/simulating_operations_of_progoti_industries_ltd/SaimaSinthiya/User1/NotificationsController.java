package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationsController {

    @FXML
    private ListView<String> notificationListView;

    private ObservableList<String> notifications = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Sample notifications
        notifications.addAll(
                "Order #101 has been placed.",
                "New feedback received from Customer #004.",
                "Production for Product A completed.",
                "Reminder: Monthly report due tomorrow."
        );

        notificationListView.setItems(notifications);
    }

    @FXML
    private void backToDashboardOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagingDirectorDashBoard.fxml"));
            Stage stage = (Stage) notificationListView.getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

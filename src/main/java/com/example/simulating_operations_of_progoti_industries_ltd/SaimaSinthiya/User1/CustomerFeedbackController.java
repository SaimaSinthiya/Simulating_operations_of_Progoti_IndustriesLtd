package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2.CustomerFeedback;
import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.ManagingDirector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;

public class CustomerFeedbackController {

    private ManagingDirector user;
    public void setter(ManagingDirector user) { this.user = user; }

    @FXML private TableView<CustomerFeedback> feedbackTable;
    @FXML private TableColumn<CustomerFeedback, String> nameCol;
    @FXML private TableColumn<CustomerFeedback, String> feedbackCol;
    @FXML private TableColumn<CustomerFeedback, String> statusCol;
    @FXML private TableColumn<CustomerFeedback, String> resolutionCol;
    @FXML private Label statusLabel;

    private ObservableList<CustomerFeedback> allFeedback = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        resolutionCol.setCellValueFactory(new PropertyValueFactory<>("resolutionTime"));
        feedbackTable.setItems(loadFeedback());
    }

    private ObservableList<CustomerFeedback> loadFeedback() {
        ObservableList<CustomerFeedback> list = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CustomerFeedbackData.bin"))) {
            while (true) {
                try {
                    list.add((CustomerFeedback) ois.readObject());
                } catch (EOFException e) { break; }
            }
        } catch (Exception e) {
            statusLabel.setText("Couldn't load feedback.");
        }
        allFeedback = list;
        return list;
    }

    private void saveFeedback() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CustomerFeedbackData.bin"))) {
            for (CustomerFeedback fb : allFeedback) oos.writeObject(fb);
        } catch (IOException e) {
            statusLabel.setText("Failed to save file.");
        }
    }

    @FXML
    private void handleResolveFeedback(ActionEvent e) {
        CustomerFeedback selected = feedbackTable.getSelectionModel().getSelectedItem();
        if (selected == null) {
            statusLabel.setText("Please select a feedback.");
            return;
        }
        selected.setStatus("Resolved");
        selected.setResolutionTime("Resolved on: " + java.time.LocalDate.now());
        feedbackTable.refresh();
        saveFeedback();
        statusLabel.setText("Marked as resolved.");
    }

    @FXML
    public void handleBack(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
                "/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/ManagingDirectorDashboard.fxml"));

        Parent root = fxmlLoader.load();
        ManagingDirectorDashBoardFxmlController controller = fxmlLoader.getController();

        if (this.user != null) {
            controller.setter(this.user);
        } else {
            System.out.println("Warning: user is null before navigating back to dashboard.");
        }

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}

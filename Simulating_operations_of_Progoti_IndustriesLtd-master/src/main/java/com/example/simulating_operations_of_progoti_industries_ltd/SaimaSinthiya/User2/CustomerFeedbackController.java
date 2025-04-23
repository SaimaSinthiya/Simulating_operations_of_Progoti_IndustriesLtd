package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerFeedbackController {
    @javafx.fxml.FXML
    private TableColumn feedbackCol;
    @javafx.fxml.FXML
    private TableColumn statusCol;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextArea feedbackArea;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn resolutionCol;
    @javafx.fxml.FXML
    private TableView feedbackTable;
    private ObservableList<CustomerFeedback> feedbackList = FXCollections.observableArrayList();
    Customer user;
    public void setter(Customer user) {
        this.user = user;
        nameField.setText(user.getName());
    }

    @FXML
    public void initialize() {
        nameCol.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        feedbackCol.setCellValueFactory(new PropertyValueFactory<>("feedbackText"));
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        resolutionCol.setCellValueFactory(new PropertyValueFactory<>("resolutionTime"));

        feedbackList = loadFeedbackFromFile();
        feedbackTable.setItems(feedbackList);
    }

    @FXML
    private void handleSubmit(ActionEvent event) {
        String name = nameField.getText();
        String text = feedbackArea.getText();

        if (name.isEmpty() || text.isEmpty()) {
            statusLabel.setText("Please fill in all fields.");
            return;
        }

        CustomerFeedback feedback = new CustomerFeedback(name, text);
        feedback.setResolutionTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        feedbackList.add(feedback);
        feedbackTable.setItems(feedbackList);
        saveFeedbackToFile(feedbackList);

        statusLabel.setText("Feedback submitted successfully!");
        feedbackArea.clear();
    }

    @javafx.fxml.FXML
    private  void handleBack(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerDashboard.fxml"));
            Parent root = loader.load();

            CustomerDashBoardController controller = loader.getController();
            if (controller != null && user != null) {
                controller.setter(user);
            }

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Customer Dashboard");
            stage.show();
        } catch (IOException e) {
            System.out.println(" Failed to load CustomerDashboard.fxml");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(" Error passing user to dashboard");
            e.printStackTrace();
        }
    }

    private ObservableList<CustomerFeedback> loadFeedbackFromFile() {
        ObservableList<CustomerFeedback> list = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("CustomerFeedbackData.bin"))) {
            while (true) {
                try {
                    list.add((CustomerFeedback) ois.readObject());
                } catch (EOFException e) { break; }
            }
        } catch (Exception e) {
            System.out.println("No feedback file found.");
        }
        return list;
    }


    private void saveFeedbackToFile(ObservableList<CustomerFeedback> list) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("CustomerFeedbackData.bin"))) {
            for (CustomerFeedback f : list) {
                oos.writeObject(f);
            }
        } catch (IOException e) {
            System.out.println("Error saving feedback (.bin): " + e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter("CustomerFeedbackData.txt")) {
            for (CustomerFeedback f : list) {
                pw.println("Name: " + f.getCustomerName());
                pw.println("Feedback: " + f.getFeedbackText());
                pw.println("Status: " + f.getStatus());
                pw.println("Resolution Time: " + f.getResolutionTime());
                pw.println("-----------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error saving feedback (.txt): " + e.getMessage());
        }
    }
}




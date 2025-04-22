package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class BusinessOverviewController {

    private ManagingDirector user;

    // Setter method to pass user details
    public void setter(ManagingDirector user) {
        this.user = user;
    }

    @FXML private TableView<BusinessPerformance> performanceTable;
    @FXML private TableColumn<BusinessPerformance, String> monthCol;
    @FXML private TableColumn<BusinessPerformance, Double> revenueCol;
    @FXML private TableColumn<BusinessPerformance, Double> profitCol;
    @FXML private TableColumn<BusinessPerformance, Double> growthCol;
    @FXML private ComboBox<String> quarterComboBox;
    @FXML private TextField searchField;
    @FXML private Label statusLabel;

    private ObservableList<BusinessPerformance> allData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Using vehicle names instead of quarters
        quarterComboBox.getItems().addAll("Pajero", "HiAce", "Saga", "Leyland");


        monthCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        revenueCol.setCellValueFactory(new PropertyValueFactory<>("totalRevenue"));
        profitCol.setCellValueFactory(new PropertyValueFactory<>("netProfit"));
        growthCol.setCellValueFactory(new PropertyValueFactory<>("growthRate"));


        performanceTable.setItems(readData());
    }

    private ObservableList<BusinessPerformance> readData() {
        ObservableList<BusinessPerformance> list = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BusinessPerformanceData.bin"))) {
            while (true) {
                try {
                    list.add((BusinessPerformance) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            statusLabel.setText("Couldn't load data.");
        }
        allData = list;
        return list;
    }

    @FXML
    private void handleFilter(ActionEvent e) {
        String vehicle = quarterComboBox.getValue();
        if (vehicle == null) {
            statusLabel.setText("Select a vehicle.");
            return;
        }

        ObservableList<BusinessPerformance> filtered = FXCollections.observableArrayList();
        for (BusinessPerformance b : allData) {
            if (b.getMonth().toLowerCase().contains(vehicle.toLowerCase())) {
                filtered.add(b);
            }
        }

        performanceTable.setItems(filtered);
        statusLabel.setText("Filtered by " + vehicle);
    }

    @FXML
    private void handleSearch(ActionEvent e) {
        String search = searchField.getText().toLowerCase();
        if (search.isEmpty()) {
            performanceTable.setItems(allData);
            statusLabel.setText("Showing all data.");
            return;
        }

        ObservableList<BusinessPerformance> result = FXCollections.observableArrayList();
        for (BusinessPerformance b : allData) {
            if (b.getMonth().toLowerCase().contains(search)) {
                result.add(b);
            }
        }

        performanceTable.setItems(result);

        if (result.isEmpty()) {
            statusLabel.setText("No match found.");
        } else {
            statusLabel.setText("Search results.");
        }
    }

    @FXML
    private void handleBack(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1/ManagingDirectorDashBoard.fxml"));
        Parent root = loader.load();
        ManagingDirectorDashBoardFxmlController controller = loader.getController();
        controller.setter(user);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Managing Director Dashboard");
        stage.show();
    }

}

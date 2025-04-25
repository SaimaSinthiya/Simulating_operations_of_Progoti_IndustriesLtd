package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class SalesReportSceneController {

    @FXML
    private TableView<SalesReport> salesReportTable;

    @FXML
    private TableColumn<SalesReport, String> orderIdColumn;

    @FXML
    private TableColumn<SalesReport, String> customerNameColumn;

    @FXML
    private TableColumn<SalesReport, Double> totalAmountColumn;

    @FXML
    private TableColumn<SalesReport, String> statusColumn;

    @FXML
    private Button btnExportReport;

    private final ObservableList<SalesReport> reportData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        totalAmountColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    public void onGenerateReportClicked(ActionEvent event) {
        reportData.clear();

        reportData.addAll(
                new SalesReport("ORD001", "Alice", 2500.0, "Completed"),
                new SalesReport("ORD002", "Bob", 1800.0, "Pending"),
                new SalesReport("ORD003", "Charlie", 3200.0, "Shipped")
        );
        salesReportTable.setItems(reportData);
    }

    @FXML
    public void onExportReportClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Export");
        alert.setHeaderText(null);
        alert.setContentText("Report exported successfully!");
        alert.showAndWait();
    }

    @FXML
    public void backButton(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "/com/example/simulating_operations_of_progoti_industries_ltd/Sakib/User3/SalesExecutiveDashboard.fxml"));

            Parent root = loader.load();

            // Optional: send user data to dashboard controller
            // ManagingDirectorDashboardController controller = loader.getController();
            // controller.setUser(this.user); // if you have a user to pass

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

import com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3.SalesRecord;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SalesReportController {

    @FXML
    private TableView<SalesRecord> salesReportTable;

    @FXML
    private TableColumn<SalesRecord, String> orderIdColumn;

    @FXML
    private TableColumn<SalesRecord, String> customerNameColumn;

    @FXML
    private TableColumn<SalesRecord, Double> totalAmountColumn;

    @FXML
    private TableColumn<SalesRecord, String> statusColumn;

    @FXML
    private Button btnGenerateReport;

    @FXML
    private Button btnExportReport;

    @FXML
    private Button btnBackToDashboard;

    @FXML
    public void initialize() {
        orderIdColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        totalAmountColumn.setCellValueFactory(new PropertyValueFactory<>("totalAmount"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    }

    private void handleExportReport() {
    }

    }
}

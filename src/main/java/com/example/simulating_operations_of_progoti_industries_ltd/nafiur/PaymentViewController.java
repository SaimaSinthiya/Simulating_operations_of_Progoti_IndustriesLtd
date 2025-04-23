package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class PaymentViewController {

    @FXML
    private TableColumn<?, ?> amountTableView;

    @FXML
    private TextField amountTextField;

    @FXML
    private CheckBox carCheckBox;

    @FXML
    private CheckBox carTireCheckBox;

    @FXML
    private TableColumn<Payment, String> clientNameTableView;

    @FXML
    private TextField clientNameTextField;

    @FXML
    private TableColumn<Payment, String> currencyTableView;

    @FXML
    private TextField currencyTextField;

    @FXML
    private TableView<Payment> customerInfoTableView;

    @FXML
    private DatePicker dueDatePicker;

    @FXML
    private TableColumn<Payment, String> dueDateTableView;

    @FXML
    private TableColumn<Payment, String> orderIdTableView;

    @FXML
    private TextField orderIdTextField;

    @FXML
    private TableColumn<Payment, String> paymentIdTableView;

    @FXML
    private TextField paymentIdTextField;

    @FXML
    private TableColumn<Payment, String> productNameTableView;

    ArrayList<Payment> paymentList;
    ArrayList<String> productName= new ArrayList<String>();



    }

    @FXML
    void addCustomerOnactionButton(ActionEvent event) {



    }
    @FXML
    void initialize(){

    }

}

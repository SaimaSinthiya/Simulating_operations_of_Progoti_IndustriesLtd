package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;

public class ProductionMangerViewController {

    @FXML
    private CheckBox componentsCheckBox;

    @FXML
    private TableColumn<ProductionManger, String> currentLevelTableView;

    @FXML
    private TextField currentLevelTextField;

    @FXML
    private DatePicker deadlineDatePicker;

    @FXML
    private TableColumn<ProductionManger, String> deadlineTableView;

    @FXML
    private TableColumn<ProductionManger, String> departmentTableView;

    @FXML
    private TableColumn<ProductionManger, String> emailTableView;

    @FXML
    private TextField emailTextField;

    @FXML
    private TableColumn<ProductionManger, String> managerIdTableView;

    @FXML
    private TextField managerIdTextField;

    @FXML
    private TableColumn<ProductionManger, String> nameTableView;

    @FXML
    private TextField nameTextField;

    @FXML
    private TableColumn<ProductionManger, String> phoneNumberTableView;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private RadioButton productionManagerRadioButton;

    @FXML
    private TableView<String> productionManagerTableView;

    @FXML
    private RadioButton qualityRadioButton;

    @FXML
    private TableColumn<ProductionManger, String> rawMaterialTableView;

    @FXML
    private TableColumn<ProductionManger, String> reOrderTableView;

    @FXML
    private TextField reOrderTextField;

    @FXML
    private CheckBox suppliesCheckBox;

    @FXML
    private Label warningLabel;

    ArrayList<ProductionManger> productionMangers;
    ToggleGroup tg;

    @FXML
    void showOnlyComponents(ActionEvent event) {

    }
    @FXML

    void initialize(){

    }

}


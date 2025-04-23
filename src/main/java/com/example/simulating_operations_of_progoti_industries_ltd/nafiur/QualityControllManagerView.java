package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class QualityControllManagerView {

    @FXML
    private ComboBox<String> departmentComboBox;

    @FXML
    private TableColumn<QualityControll,String > departmentTableView;

    @FXML
    private TableColumn<QualityControll,String > failProductsTableView;

    @FXML
    private TextField failProductsTextField;

    @FXML
    private RadioButton femaleRadioButton;

    @FXML
    private TableColumn<QualityControll,String > genderTableView;

    @FXML
    private CheckBox inspectionsMaterialCheckBox;

    @FXML
    private CheckBox inspectionsProductsCheckBox;

    @FXML
    private TableColumn<QualityControll,String > inspectionsTableView;

    @FXML
    private RadioButton maleradioButton;

    @FXML
    private TableColumn<QualityControll,String > managerIdTableView;

    @FXML
    private TextField managerIdTextField;

    @FXML
    private TableView<QualityControll> managerInfoTableView;

    @FXML
    private CheckBox managerSkillBadCheckbox;

    @FXML
    private CheckBox managerSkillGoodCheckbox;

    @FXML
    private TableColumn<QualityControll,String > managerSkillTableView;

    @FXML
    private TableColumn<QualityControll,String > nameIdTableView;

    @FXML
    private TextField nameTextField;

    @FXML
    private TableColumn<QualityControll,String > passProductsTableView;

    @FXML
    private TextField passproductsTextField;

    @FXML
    private DatePicker shiftTimeDatePicker;

    @FXML
    private TableColumn<QualityControll,String > shiftTimeTableView;

    @FXML
    private Label warningLabel;
    ArrayList<QualityControll> qualityControllArrayList;
    ToggleGroup tg;

    @FXML
    void addManagerOnActionButton(ActionEvent event) {
        String gender="";
        if(maleradioButton.isSelected())
            gender="Male";
        else if (femaleRadioButton.isSelected())
            gender="Female";
        ArrayList <String> managerSkill = new ArrayList<String>();
        if (managerSkillGoodCheckbox.isSelected() && managerSkillBadCheckbox.isSelected()){
            managerSkill.add("Good");
            managerSkill.add("Bad");

        }
        else if (managerSkillGoodCheckbox.isSelected())
            managerSkill.add("Good");
        else if (managerSkillBadCheckbox.isSelected())
            managerSkill.add("Bad");
        ArrayList<String>inspections= new ArrayList<String>();
        if (inspectionsMaterialCheckBox.isSelected() && inspectionsProductsCheckBox.isSelected()){
            inspections.add("Material");
            inspections.add("Products");

        }
        else if (inspectionsMaterialCheckBox.isSelected())
            inspections.add("Material");
        else if (inspectionsProductsCheckBox.isSelected())
            inspections.add("Products");

        QualityControll qualityControlltoBeAdded =new QualityControll(
                Integer.parseInt(managerIdTextField.getText()),
                nameTextField.getText(),
                departmentComboBox.getValue(),
                gender,
                Arrays.toString(inspections.toArray()) ,
                passproductsTextField.getText(),
                failProductsTextField.getText(),
                Arrays.toString(managerSkill.toArray()),
                shiftTimeDatePicker.getValue(),





        );
        managerInfoTableView.getItems().add(qualityControlltoBeAdded);
        qualityControllArrayList.add(qualityControlltoBeAdded);




    }

    @FXML
    void showOnlyManagerOnActionButton(ActionEvent event) {

    }
    @FXML
    void initialize(){
        qualityControllArrayList= new ArrayList<>();
        tg=new ToggleGroup();
        maleradioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);

        shiftTimeDatePicker.setValue(LocalDate.now());
        departmentComboBox.getItems().addAll("Production Department Head","Quality Department","Quality Manager");
        managerIdTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" managerId"));
        nameIdTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" name"));
        departmentTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" department"));
        genderTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" gender"));
        inspectionsTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" inspections"));
        passProductsTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" passProducts"));
        failProductsTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" failProducts"));
        shiftTimeTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" shiftTime"));
        managerSkillTableView.setCellValueFactory(new PropertyValueFactory<QualityControll,String>(" managerSkill"));

    }

}

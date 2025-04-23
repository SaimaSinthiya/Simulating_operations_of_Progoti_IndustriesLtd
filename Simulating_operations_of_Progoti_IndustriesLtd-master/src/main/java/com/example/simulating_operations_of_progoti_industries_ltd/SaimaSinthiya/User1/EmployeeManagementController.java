package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeManagementController {

    @FXML private TextField employeeIdField;
    @FXML private TextField nameField;
    @FXML private TextField positionField;
    @FXML private TextField salaryField;
    @FXML private ComboBox<String> departmentComboBox;
    @FXML private ComboBox<String> selectDepartmentComboBox;
    @FXML private TableView<Employee> employeeTableView;
    @FXML private TableColumn<Employee, Integer> employeeIdColumn;
    @FXML private TableColumn<Employee, String> nameColumn;
    @FXML private TableColumn<Employee, String> positionColumn;
    @FXML private TableColumn<Employee, Double> salaryColumn;
    @FXML private TableColumn<Employee, String> departmentColumn;

    private ObservableList<Employee> employeeList = FXCollections.observableArrayList();
    @FXML
    private Button updateEmployeeButton;
    @FXML
    private Button validateIdButton;
    @FXML
    private Button addEmployeeButton;
    @FXML
    private Button deleteEmployeeButton;
    @FXML
    private Button filterByDepartmentButton;
    @FXML
    private Button filterByDepartmentButton1;

    @FXML
    public void initialize() {
        departmentComboBox.getItems().addAll("HR", "Sales", "Finance", "Production");
        selectDepartmentComboBox.getItems().addAll("HR", "Sales", "Finance", "Production");

        employeeIdColumn.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        positionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));


        employeeTableView.setItems(employeeList);



    }

    @FXML
    public void AddEmployee(ActionEvent event) {
        try {
            int id = Integer.parseInt(employeeIdField.getText());
            String name = nameField.getText();
            String position = positionField.getText();
            double salary = Double.parseDouble(salaryField.getText());
            String department = departmentComboBox.getValue();

            if (department != null) {
                Employee emp = new Employee(id, name, position, salary, department);
                employeeList.add(emp);
                clearFields();
            } else {
                showAlert("Input Error", "Please select a department.");
            }
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter valid ID and salary values.");
        }
    }

    @FXML
    public void UpdateEmployee(ActionEvent event) {
        Employee selected = employeeTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            try {
                selected.setEmployeeId(Integer.parseInt(employeeIdField.getText()));
                selected.setName(nameField.getText());
                selected.setPosition(positionField.getText());
                selected.setSalary(Double.parseDouble(salaryField.getText()));
                selected.setDepartment(departmentComboBox.getValue());
                employeeTableView.refresh();
                clearFields();
            } catch (NumberFormatException e) {
                showAlert("Input Error", "Please enter valid ID and salary values.");
            }
        } else {
            showAlert("Selection Error", "Please select an employee to update.");
        }
    }

    @FXML
    public void DeleteEmployee(ActionEvent event) {
        Employee selected = employeeTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            employeeList.remove(selected);
            clearFields();
        } else {
            showAlert("Selection Error", "Please select an employee to delete.");
        }
    }

    @FXML
    public void ValidateId(ActionEvent event) {
        String id = employeeIdField.getText().trim();
        boolean exists = employeeList.stream().anyMatch(emp -> String.valueOf(emp.getEmployeeId()).equals(id));

        if (exists) {
            showAlert("Validation", "Employee ID already exists.");
        } else {
            showAlert("Validation", "Employee ID is available.");
        }
    }

    @FXML
    public void FilterByDepartment(ActionEvent event) {
        String department = selectDepartmentComboBox.getValue();
        if (department != null) {
            ObservableList<Employee> filteredList = FXCollections.observableArrayList();
            for (Employee emp : employeeList) {
                if (emp.getDepartment().equals(department)) {
                    filteredList.add(emp);
                }
            }
            employeeTableView.setItems(filteredList);
        } else {
            showAlert("Selection Error", "Please select a department to filter.");
        }
    }

    private void clearFields() {
        employeeIdField.clear();
        nameField.clear();
        positionField.clear();
        salaryField.clear();
        departmentComboBox.setValue(null);
        selectDepartmentComboBox.setValue(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    public void back(ActionEvent actionEvent) {
    }
}

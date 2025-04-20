package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;


public class ManagingDirectorDashBoardFxmlController implements Initializable {

    @FXML private Label nameLabel;
    @FXML private Label userTypeLabel;
    @FXML private Label idLabel;

    Alert alert;
    ManagingDirector user;

    public ManagingDirector get() {
        return user;
    }

    public void set(ManagingDirector u) {
        user = u;
        nameLabel.setText(user.getName());
        userTypeLabel.setText(user.getUserType());
        idLabel.setText(String.valueOf(user.getId()));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Optional: anything to do right after loading the scene
    }
    }

   /* @FXML
    private void businessOverviewOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal1_BusinessOverview/BusinessOverviewScene.fxml"));
        Parent root = loader.load();
        BusinessOverviewSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Business Overview");
        stage.show();
    }

    @FXML
    private void inventoryProductionOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal2_InventoryProduction/InventoryProductionScene.fxml"));
        Parent root = loader.load();
        InventoryProductionSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Inventory & Production");
        stage.show();
    }

    @FXML
    private void attendanceOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal3_Attendance/AttendanceScene.fxml"));
        Parent root = loader.load();
        AttendanceSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Monitor Attendance");
        stage.show();
    }

    @FXML
    private void inventoryOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal4_Inventory/InventoryScene.fxml"));
        Parent root = loader.load();
        InventorySceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Manage Inventory");
        stage.show();
    }

    @FXML
    private void financialReportsOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal5_FinancialReports/FinancialReportsScene.fxml"));
        Parent root = loader.load();
        FinancialReportsSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Financial Reports");
        stage.show();
    }

    @FXML
    private void salesOrdersOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal6_SalesOrders/SalesOrdersScene.fxml"));
        Parent root = loader.load();
        SalesOrdersSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Sales and Orders");
        stage.show();
    }

    @FXML
    private void notificationsOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal7_Notifications/NotificationsScene.fxml"));
        Parent root = loader.load();
        NotificationsSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Notifications");
        stage.show();
    }

    @FXML
    private void customerFeedbackOnMouseClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/MD/Goal8_CustomerFeedback/CustomerFeedbackScene.fxml"));
        Parent root = loader.load();
        CustomerFeedbackSceneController controller = loader.getController();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Customer Feedback");
        stage.show();
    }

    @FXML
    private void signoutOnMouseClick(MouseEvent event) throws IOException {
        user.setStatus("Deactive");
        Parent root = FXMLLoader.load(getClass().getResource("/mainpkg/Login/LoginSceneFxml.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }
}*/

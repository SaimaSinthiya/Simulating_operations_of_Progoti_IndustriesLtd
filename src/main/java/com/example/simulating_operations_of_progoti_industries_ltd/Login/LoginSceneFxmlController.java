package com.example.simulating_operations_of_progoti_industries_ltd.Login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Profile.ManagingDirector;
import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Profile.ManagingDirectorDashBoardController;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginSceneFxmlController implements Initializable {

    @FXML private TextField userIdTextField;
    @FXML private PasswordField pwPasswordField;
    @FXML private Label forgetPasswordLabel;
    @FXML private ComboBox<String> userTypeComboBox;

    private Alert alert;
    private ObservableList<ManagingDirector> mdList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mdList = fileReadmd(); // Read saved ManagingDirector users from file

        // Example hardcoded user (optional)
        ManagingDirector m = new ManagingDirector(5500000, "Saima", "asdf", "01312961739", "saima@gmail.com", "Managing Director", "Female", "04/04/2003","asjkjksjdkj",5);
        mdList.add(m);

        userTypeComboBox.getItems().addAll(
                "Managing Director", "Customer", "Sales Executive",
                "Finance Department Head", "Production Manager",
                "Quality Control Manager", "Logistic Manager", "Showroom Manager"
        );
        userTypeComboBox.setValue("Managing Director");
    }

    @FXML
    private void loginOnMouseClick(MouseEvent event) throws IOException {
        boolean valid = true;

        String userIdStr = userIdTextField.getText();
        int userId = 0;

        try {
            userId = Integer.parseInt(userIdStr);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.WARNING, "ID Error", "ID must be numeric.");
            return;
        }

        if (userIdStr.isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "ID Error", "ID Required.");
            return;
        } else if (userId < 1000000 || userId > 9999999) {
            showAlert(Alert.AlertType.WARNING, "ID Error", "ID must be 7 digits.");
            return;
        }

        String pw = pwPasswordField.getText();
        if (pw.length() < 8) {
            showAlert(Alert.AlertType.WARNING, "Password Error", pw.isEmpty() ? "Password Required." : "Password must be at least 8 characters.");
            return;
        }

        String userType = userTypeComboBox.getValue();

        if (userType.equals("Managing Director")) {
            for (ManagingDirector md : mdList) {
                ManagingDirector verifiedUser = md.verifyLogin(userId, pw);
                if (verifiedUser != null) {
                    showAlert(Alert.AlertType.CONFIRMATION, "Login Success", "Welcome, " + verifiedUser.getName());

                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User1_ManagingDirector/Profile/ManagingDirectorDashBoard.fxml"));
                    Parent root = loader.load();

                    ManagingDirectorDashBoardController controller = loader.getController();
                    controller.set(verifiedUser);

                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Managing Director Dashboard");
                    stage.show();
                    return;
                }
            }

            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid ID or Password.");
        }

        // Future: Add logic for other user types
    }

    private ObservableList<ManagingDirector> fileReadmd() {
        ObservableList<ManagingDirector> list = FXCollections.observableArrayList();
        File file = new File("src/File/ManagingDirector.bin");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                ManagingDirector md = (ManagingDirector) ois.readObject();
                list.add(md);
            }
        } catch (EOFException eof) {
            // Normal EOF
        } catch (Exception e) {
            System.out.println("File read error: " + e.getMessage());
        }

        return list;
    }

    private void showAlert(Alert.AlertType type, String header, String content) {
        alert = new Alert(type);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @FXML
    private void forgetPasswordOnMouseClick(MouseEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Password Help", "Please contact admin to reset your password.");
    }

    @FXML
    private void createAccountOnMouseClick(MouseEvent event) {
        showAlert(Alert.AlertType.INFORMATION, "Create Account", "Account creation feature coming soon.");
    }
}

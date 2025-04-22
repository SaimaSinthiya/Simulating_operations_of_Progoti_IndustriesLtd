package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerDashBoardController {

    private Customer user;

    public void setter(Customer user) {
        this.user = user;
    }

    private void loadSceneWithUser(String fxmlPath, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        Parent root = loader.load();

        Object controller = loader.getController();
        try {
            controller.getClass().getMethod("setter", Customer.class).invoke(controller, this.user);
        } catch (Exception e) {
            System.out.println("No setter found in: " + controller.getClass().getSimpleName());
        }

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void goToPlaceOrder(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerPlaceOrder.fxml", event);
    }

    @javafx.fxml.FXML
    public void goToSupport(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerSupport.fxml", event);
    }

    @javafx.fxml.FXML
    public void goToNotifications(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerNotification.fxml", event);
    }

    @javafx.fxml.FXML
    public void goToPayment(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerPayment.fxml", event);
    }

    @javafx.fxml.FXML
    public void goToOrderStatus(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerOrderStatus.fxml", event);
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Login/LoginScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }

    @javafx.fxml.FXML
    public void goToProductDetails(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerProductDetails.fxml", event);
    }
    @javafx.fxml.FXML
    public void goToFeedback(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerFeedback.fxml", event);
    }
    public void goToPurchaseHistory(ActionEvent event) throws IOException {
        loadSceneWithUser("/com/example/simulating_operations_of_progoti_industries_ltd/SaimaSinthiya/User2/CustomerPurchaseHistory.fxml", event);
    }

}

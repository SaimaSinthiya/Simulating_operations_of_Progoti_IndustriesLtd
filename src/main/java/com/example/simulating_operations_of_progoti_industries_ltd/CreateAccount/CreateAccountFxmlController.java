package com.example.simulating_operations_of_progoti_industries_ltd.CreateAccount;

import com.example.simulating_operations_of_progoti_industries_ltd.AbstractClass.AppendableObjectOutputStream;
import com.example.simulating_operations_of_progoti_industries_ltd.AbstractClass.User;
import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1_ManagingDirector.Profile.ManagingDirector;
//import com.example.simulating_operations_of_progoti_industries_ltd.Customer.Customer;
//import com.example.simulating_operations_of_progoti_industries_ltd.SalesExecutive.SalesExecutive;
//import com.example.simulating_operations_of_progoti_industries_ltd.FinanceDepartment.FinanceDepartmentHead;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.Random;

public class CreateAccountFxmlController {

    public TextArea addressTA, showTA;
    public TextField nameTF, emailTF, pNTF;
    public ComboBox<String> userTypeCB;
    public PasswordField passwordPF;
    public DatePicker dobDP;

    public void initialize() {
        userTypeCB.getItems().addAll(
                "Managing Director", "Customer", "Sales Executive", "Finance Department Head"
        );
    }

    public void loginButtonOA(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/simulating_operations_of_progoti_industries_ltd/Login/LoginFxml.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Login");
        stage.show();
    }

    @javafx.fxml.FXML
    public void createAccountButtonOA(ActionEvent actionEvent) {
        String name, email, pN, address, password, userType;
        LocalDate dob;
        int id = 0;
        Random random = new Random();

        name = nameTF.getText();
        email = emailTF.getText();
        pN = pNTF.getText();
        address = addressTA.getText();
        password = passwordPF.getText();
        userType = userTypeCB.getValue();
        dob = dobDP.getValue();

        if (userType == "Managing Director") {
            id = random.nextInt(10000, 99999);
            ManagingDirector md = new ManagingDirector(id, name, email, pN, password, userType, address, dob);
            showTA.setText(md.toString());
            this.writeManagingDirector(md);
            this.writeUser(md);
        }
//        else if (userType == "SoD") {
//            id = random.nextInt(100000, 999999) ;
//            SoD librian = new Librian(id ,name, email, pN, password, userType, address, dob) ;
//        }
        else if (userType == "Member") {
            id = random.nextInt(1000000, 9999999);
            Member member = new Member(id, name, email, pN, password, userType, address, dob);
            showTA.setText(member.toString());
            this.writeMember(member);
            this.writeUser(member);
        }
        nameTF.clear();
        emailTF.clear();
        pNTF.clear();
        addressTA.clear();
        passwordPF.clear();
    }

    public void writeManagingDirector(ManagingDirector director) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("ManagingDirectorData.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(director);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
    /*public void writeCustomer(Customer customer) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("CustomerData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
//                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(customer);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    public void writeUser(User user) {
        File f = null ;
        FileWriter fw = null ;

        try {
            f = new File("UserData.txt") ;
            if (f.exists()) {
                fw = new FileWriter(f, true) ;
            }
            else {
                fw = new FileWriter(f) ;
            }

            fw.write(user.getId() + "," + user.getPassword() + "," + user.getType() + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/
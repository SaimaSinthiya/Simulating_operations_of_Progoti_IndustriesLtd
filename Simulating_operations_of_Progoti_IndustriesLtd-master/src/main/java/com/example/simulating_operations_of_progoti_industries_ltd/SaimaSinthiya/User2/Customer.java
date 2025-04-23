package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1.User;

import java.io.Serializable;

public class Customer extends User implements Serializable {
    private String address;
    private String paymentMethod;


    public Customer(int userID, String name, String emailID, String phoneNumber, String designation, String password, String address, String paymentMethod) {
        super(userID, name, emailID, phoneNumber, designation, password);
        this.address = address;
        this.paymentMethod = paymentMethod;
    }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }

    @Override
    public String toString() {
        return super.toString() + ", address='" + address + '\'' + ", paymentMethod='" + paymentMethod + '\'';
    }
}

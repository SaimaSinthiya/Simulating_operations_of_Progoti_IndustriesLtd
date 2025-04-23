package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class SalesOrder implements Serializable {
    private String orderId;
    private String productName;
    private String customerName;
    private int quantity;
    private double totalPrice;
    private String status;

    public SalesOrder(String orderId, String productName, String customerName, int quantity, double totalPrice, String status) {
        this.orderId = orderId;
        this.productName = productName;
        this.customerName = customerName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getOrderId() { return orderId; }
    public String getProductName() { return productName; }
    public String getCustomerName() { return customerName; }
    public int getQuantity() { return quantity; }
    public double getTotalPrice() { return totalPrice; }
    public String getStatus() { return status; }
}

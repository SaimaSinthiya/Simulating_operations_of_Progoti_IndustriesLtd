package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderId;
    private String productName;
    private String status;
    private String expectedDeliveryDate;

    public Order(String orderId, String productName, String status, String expectedDeliveryDate) {
        this.orderId = orderId;
        this.productName = productName;
        this.status = status;
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public String getOrderId() { return orderId; }
    public String getProductName() { return productName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getExpectedDeliveryDate() { return expectedDeliveryDate; }
}


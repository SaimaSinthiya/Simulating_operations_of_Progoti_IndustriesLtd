package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User3;

public class SalesReport {
    private final String orderId;
    private final String customerName;
    private final double totalAmount;
    private final String status;

    public SalesReport(String orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
}

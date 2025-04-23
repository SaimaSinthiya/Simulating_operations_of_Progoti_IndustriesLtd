package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import java.time.LocalDate;

public class Payment {
    private int paymentId;
    private int orderId;
    private String clientName,amount,currency,productName;
    private LocalDate dueDate;

    public Payment() {
    }

    public Payment(int paymentId, int orderId, String clientName, String amount, String currency, String productName, LocalDate dueDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.clientName = clientName;
        this.amount = amount;
        this.currency = currency;
        this.productName = productName;
        this.dueDate = dueDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", orderId=" + orderId +
                ", clientName='" + clientName + '\'' +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", productName='" + productName + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}

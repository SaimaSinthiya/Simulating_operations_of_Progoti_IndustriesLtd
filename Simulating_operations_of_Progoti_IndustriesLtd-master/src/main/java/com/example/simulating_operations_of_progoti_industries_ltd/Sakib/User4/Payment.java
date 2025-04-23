package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;
import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {
    private String paymentId;
    private String dueDate;
    private double amount;
    private String status;


    public Payment(String paymentId, String dueDate, double amount, String status) {
        this.paymentId = paymentId;
        this.dueDate = dueDate;
        this.amount = amount;
        this.status = status;
    }


    public String getPaymentId() {
        return paymentId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }


    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}

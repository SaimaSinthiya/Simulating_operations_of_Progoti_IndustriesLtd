package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import java.io.Serializable;

public class CustomerFeedback implements Serializable {
    private String customerName;
    private String feedbackText;
    private String status;
    private String resolutionTime;

    public CustomerFeedback(String customerName, String feedbackText) {
        this.customerName = customerName;
        this.feedbackText = feedbackText;
        this.status = "Pending";
        this.resolutionTime = "Not resolved yet";
    }

    public String getCustomerName() { return customerName; }
    public String getFeedbackText() { return feedbackText; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getResolutionTime() { return resolutionTime; }
    public void setResolutionTime(String resolutionTime) { this.resolutionTime = resolutionTime; }
}

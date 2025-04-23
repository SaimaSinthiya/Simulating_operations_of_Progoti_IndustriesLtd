package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class Feedback implements Serializable {
    private String customerName;
    private String product;
    private String issue;
    private String status;

    public Feedback(String customerName, String product, String issue, String status) {
        this.customerName = customerName;
        this.product = product;
        this.issue = issue;
        this.status = status;
    }

    public String getCustomerName() { return customerName; }
    public String getProduct() { return product; }
    public String getIssue() { return issue; }
    public String getStatus() { return status; }
}


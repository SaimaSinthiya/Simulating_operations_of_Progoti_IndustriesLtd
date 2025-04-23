package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import java.io.Serializable;

public class SupportRequest implements Serializable {
    private String supportType;
    private String message;
    private String customerName;

    public SupportRequest(String supportType, String message, String customerName) {
        this.supportType = supportType;
        this.message = message;
        this.customerName = customerName;
    }

    public String getSupportType() { return supportType; }
    public String getMessage() { return message; }
    public String getCustomerName() { return customerName; }

    @Override
    public String toString() {
        return "SupportRequest{" +
                "supportType='" + supportType + '\'' +
                ", message='" + message + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

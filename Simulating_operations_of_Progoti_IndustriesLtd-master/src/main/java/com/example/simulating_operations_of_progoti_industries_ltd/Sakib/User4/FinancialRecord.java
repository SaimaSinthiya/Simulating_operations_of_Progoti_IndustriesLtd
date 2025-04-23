package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;
import java.util.Date;

public class FinancialRecord implements Serializable {
    private String recordId;
    private String date;
    private String type;
    private double amount;
    private String description;


    public FinancialRecord(String recordId, String date, String type, double amount, String description) {
        this.recordId = recordId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.description = description;
    }


    public String getRecordId() {
        return recordId;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }


    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "FinancialRecord{" +
                "recordId='" + recordId + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}




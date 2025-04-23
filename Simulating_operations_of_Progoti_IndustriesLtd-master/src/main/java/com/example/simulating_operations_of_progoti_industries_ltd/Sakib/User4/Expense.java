package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;

public class Expense implements Serializable {
    private String category;
    private double amount;
    private String description;


    public Expense(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }


    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}

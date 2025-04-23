package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class FinancialReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String date;
    private double totalRevenue;
    private double totalExpense;
    private double netProfit;

    public FinancialReport(String date, double totalRevenue, double totalExpense, double netProfit) {
        this.date = date;
        this.totalRevenue = totalRevenue;
        this.totalExpense = totalExpense;
        this.netProfit = netProfit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(double totalExpense) {
        this.totalExpense = totalExpense;
    }

    public double getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(double netProfit) {
        this.netProfit = netProfit;
    }
}
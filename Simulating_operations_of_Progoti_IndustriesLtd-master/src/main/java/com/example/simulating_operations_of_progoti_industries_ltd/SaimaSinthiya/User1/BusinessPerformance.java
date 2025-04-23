package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class BusinessPerformance implements Serializable {
    private String month;
    private double totalRevenue;
    private double netProfit;
    private double growthRate;

    public BusinessPerformance(String month, double totalRevenue, double netProfit, double growthRate) {
        this.month = month;
        this.totalRevenue = totalRevenue;
        this.netProfit = netProfit;
        this.growthRate = growthRate;
    }

    public String getMonth() { return month; }
    public double getTotalRevenue() { return totalRevenue; }
    public double getNetProfit() { return netProfit; }
    public double getGrowthRate() { return growthRate; }
}

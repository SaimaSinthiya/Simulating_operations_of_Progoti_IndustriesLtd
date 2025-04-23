package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;
import java.util.Date;

public class Revenue implements Serializable {
    private String month;
    private double totalRevenue;
    private double netProfit;
    private double growthRate;

    public Revenue(String month, double totalRevenue, double netProfit, double growthRate) {
        this.month = month;
        this.totalRevenue = totalRevenue;
        this.netProfit = netProfit;
        this.growthRate = growthRate;
    }

    public String getMonth() {
        return month;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    public double getNetProfit() {
        return netProfit;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setTotalRevenue(double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public void setNetProfit(double netProfit) {
        this.netProfit = netProfit;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    @Override
    public String toString() {
        return "Revenue{" +
                "month='" + month + '\'' +
                ", totalRevenue=" + totalRevenue +
                ", netProfit=" + netProfit +
                ", growthRate=" + growthRate +
                '}';
    }
}

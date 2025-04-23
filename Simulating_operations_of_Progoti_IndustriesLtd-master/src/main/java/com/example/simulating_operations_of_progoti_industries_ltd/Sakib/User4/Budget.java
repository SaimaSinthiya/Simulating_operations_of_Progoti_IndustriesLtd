package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;

public class Budget implements Serializable {
    private String department;
    private double allocatedAmount;
    private double usedAmount;

    public Budget(String department, double allocatedAmount, double usedAmount) {
        this.department = department;
        this.allocatedAmount = allocatedAmount;
        this.usedAmount = usedAmount;
    }

    public String getDepartment() { return department; }
    public double getAllocatedAmount() { return allocatedAmount; }
    public double getUsedAmount() { return usedAmount; }

    public void setDepartment(String department) { this.department = department; }
    public void setAllocatedAmount(double allocatedAmount) { this.allocatedAmount = allocatedAmount; }
    public void setUsedAmount(double usedAmount) { this.usedAmount = usedAmount; }

    @Override
    public String toString() {
        return "Budget{" +
                "department='" + department + '\'' +
                ", allocatedAmount=" + allocatedAmount +
                ", usedAmount=" + usedAmount +
                '}';
    }
}

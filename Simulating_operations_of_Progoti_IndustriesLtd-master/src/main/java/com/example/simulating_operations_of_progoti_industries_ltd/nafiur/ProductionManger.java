package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import java.time.LocalDate;

public class ProductionManger {
    private int currentLevel,reOrder;
    private String managerId, name, email, phoneNumber,department;
    private LocalDate dateline;

    public ProductionManger() {
    }

    public ProductionManger(int currentLevel, int reOrder, String managerId, String name, String email, String phoneNumber, String department, LocalDate dateline) {
        this.currentLevel = currentLevel;
        this.reOrder = reOrder;
        this.managerId = managerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.dateline = dateline;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getReOrder() {
        return reOrder;
    }

    public void setReOrder(int reOrder) {
        this.reOrder = reOrder;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getDateline() {
        return dateline;
    }

    public void setDateline(LocalDate dateline) {
        this.dateline = dateline;
    }

    @Override
    public String toString() {
        return "ProductionManger{" +
                "currentLevel=" + currentLevel +
                ", reOrder=" + reOrder +
                ", managerId='" + managerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", department='" + department + '\'' +
                ", dateline=" + dateline +
                '}';
    }
}

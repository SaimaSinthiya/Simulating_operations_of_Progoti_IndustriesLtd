package com.example.simulating_operations_of_progoti_industries_ltd.nafiur;

import java.time.LocalDate;

public class QualityControll {
    private int managerId;
    private String name,department,gender,inspections,passProducts,failProducts,managerSkill;
    private LocalDate shiftTime;

    public QualityControll() {
    }

    public int getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public String getInspections() {
        return inspections;
    }

    public String getPassProducts() {
        return passProducts;
    }

    public String getFailProducts() {
        return failProducts;
    }

    public String getManagerSkill() {
        return managerSkill;
    }

    public LocalDate getShiftTime() {
        return shiftTime;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInspections(String inspections) {
        this.inspections = inspections;
    }

    public void setPassProducts(String passProducts) {
        this.passProducts = passProducts;
    }

    public void setFailProducts(String failProducts) {
        this.failProducts = failProducts;
    }

    public void setManagerSkill(String managerSkill) {
        this.managerSkill = managerSkill;
    }

    public void setShiftTime(LocalDate shiftTime) {
        this.shiftTime = shiftTime;
    }

    @Override
    public String toString() {
        return "QualityControll{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", inspections='" + inspections + '\'' +
                ", passProducts='" + passProducts + '\'' +
                ", failProducts='" + failProducts + '\'' +
                ", managerSkill='" + managerSkill + '\'' +
                ", shiftTime=" + shiftTime +
                '}';
    }
}

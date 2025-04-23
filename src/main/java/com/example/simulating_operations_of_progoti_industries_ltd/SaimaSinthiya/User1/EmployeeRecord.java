package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class EmployeeRecord implements Serializable {
    private String name;
    private String role;
    private int attendance;
    private String performanceRating;

    public EmployeeRecord(String name, String role, int attendance, String performanceRating) {
        this.name = name;
        this.role = role;
        this.attendance = attendance;
        this.performanceRating = performanceRating;
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public int getAttendance() { return attendance; }
    public String getPerformanceRating() { return performanceRating; }
}

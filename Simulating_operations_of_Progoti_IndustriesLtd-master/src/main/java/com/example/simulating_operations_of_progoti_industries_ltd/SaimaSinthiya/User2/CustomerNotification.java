package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import java.io.Serializable;

public class CustomerNotification implements Serializable {
    private String title;
    private String message;

    public CustomerNotification(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() { return title; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "CustomerNotification{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}


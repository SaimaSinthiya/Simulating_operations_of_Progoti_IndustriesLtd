package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class Notification implements Serializable {
    private String recipient;
    private String message;
    private String type;

    public Notification(String recipient, String message, String type) {
        this.recipient = recipient;
        this.message = message;
        this.type = type;
    }

    public String getRecipient() { return recipient; }
    public String getMessage() { return message; }
    public String getType() { return type; }
}


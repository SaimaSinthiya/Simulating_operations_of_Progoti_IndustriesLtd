package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import javafx.beans.property.*;

public class OrderItem {
    private final StringProperty orderId;
    private final StringProperty productName;
    private final IntegerProperty quantity;

    public OrderItem(String orderId, String productName, int quantity) {
        this.orderId = new SimpleStringProperty(orderId);
        this.productName = new SimpleStringProperty(productName);
        this.quantity = new SimpleIntegerProperty(quantity);
    }

    public StringProperty orderIdProperty() {
        return orderId;
    }

    public StringProperty productNameProperty() {
        return productName;
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }
}

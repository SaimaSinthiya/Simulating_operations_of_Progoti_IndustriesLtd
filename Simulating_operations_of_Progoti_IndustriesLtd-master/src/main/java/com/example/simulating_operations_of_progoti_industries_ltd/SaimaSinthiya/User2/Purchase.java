package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

public class Purchase {
    private String orderId;
    private String productName;
    private String purchaseDate;
    private String amount;

    // Constructor
    public Purchase(String orderId, String productName, String purchaseDate, String amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.purchaseDate = purchaseDate;
        this.amount = amount;
    }

    // Getter methods
    public String getOrderId() {
        return orderId;
    }

    public String getProductName() {
        return productName;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getAmount() {
        return amount;
    }
}


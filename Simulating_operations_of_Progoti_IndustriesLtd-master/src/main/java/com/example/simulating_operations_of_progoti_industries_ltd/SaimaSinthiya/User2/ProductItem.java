package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

public class ProductItem {
    private String productName;
    private int quantity;

    public ProductItem(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ProductItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

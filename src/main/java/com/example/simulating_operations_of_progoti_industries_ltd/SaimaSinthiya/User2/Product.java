package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User2;

import java.io.Serializable;

public class Product implements Serializable {
    private String productName;
    private int unitsProduced;
    private String productType;

    public Product(String productName, int unitsProduced, String productType) {
        this.productName = productName;
        this.unitsProduced = unitsProduced;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsProduced() {
        return unitsProduced;
    }

    public void setUnitsProduced(int unitsProduced) {
        this.unitsProduced = unitsProduced;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitsProduced=" + unitsProduced +
                ", productType='" + productType + '\'' +
                '}';
    }
}
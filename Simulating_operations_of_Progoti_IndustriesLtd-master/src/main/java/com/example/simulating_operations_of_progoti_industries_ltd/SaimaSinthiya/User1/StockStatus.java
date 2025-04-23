package com.example.simulating_operations_of_progoti_industries_ltd.SaimaSinthiya.User1;

import java.io.Serializable;

public class StockStatus implements Serializable {
    private String productName;
    private int stockLevel;
    private boolean reorderStatus;
    private String productionStatus;

    public StockStatus(String productName, int stockLevel, boolean reorderStatus, String productionStatus) {
        this.productName = productName;
        this.stockLevel = stockLevel;
        this.reorderStatus = reorderStatus;
        this.productionStatus = productionStatus;
    }

    public String getProductName() { return productName; }
    public int getStockLevel() { return stockLevel; }
    public boolean isReorderStatus() { return reorderStatus; }
    public String getProductionStatus() { return productionStatus; }
}


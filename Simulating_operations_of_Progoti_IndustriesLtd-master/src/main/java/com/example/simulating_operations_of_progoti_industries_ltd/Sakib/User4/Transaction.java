package com.example.simulating_operations_of_progoti_industries_ltd.Sakib.User4;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
    private String transactionId;
    private Date date;
    private String type; // Sale / Payment / Refund etc.
    private double amount;
    private String involvedParty;

    public Transaction(String transactionId, Date date, String type, double amount, String involvedParty) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.involvedParty = involvedParty;
    }

    public String getTransactionId() { return transactionId; }
    public Date getDate() { return date; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public String getInvolvedParty() { return involvedParty; }

    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public void setDate(Date date) { this.date = date; }
    public void setType(String type) { this.type = type; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setInvolvedParty(String involvedParty) { this.involvedParty = involvedParty; }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}

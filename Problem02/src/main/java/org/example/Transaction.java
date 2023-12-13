package org.example;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private String transactionDate;
    private double transactionAmount;
    private String transactionType;
    private int transactionID;

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Transaction() {
    }

    public Transaction(int transactionID, String transactionDate, double transactionAmount, String transactionType) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;
    }
}

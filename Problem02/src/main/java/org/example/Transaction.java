package org.example;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private int customerID;
    private int accountNumber;
    private String customerName;
    private String email;
    private int phoneNumber;
    private static List<Transaction> transactionList = new ArrayList<>();
    public static List<Transaction> getTransactionList() {
        return transactionList;
    }
    public static void setTransactionList(List<Transaction> transactionList) {
        Transaction.transactionList = transactionList;
    }
    public Transaction() {
    }
    public Transaction(int customerID, String customerName, String email, int phoneNumber, int accountNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void addAccount(Transaction transaction){
        transactionList.add(transaction);
    }
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

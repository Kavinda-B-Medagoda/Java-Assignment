package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transaction {
    Scanner scanner = new Scanner(System.in);
    private int accountNumber;
    private LocalDate transactionDate;
    private double transactionAmount;
    private String transactionType;
    private int transactionID;

    private static ArrayList<Transaction> transactionArrayList = new ArrayList<>();


    public ArrayList<Transaction> getTransactionArrayList() {
        return transactionArrayList;
    }

    public void setTransactionArrayList(ArrayList<Transaction> transactionArrayList) {
        this.transactionArrayList = transactionArrayList;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
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

    public Transaction(int accountNumber, int transactionID, LocalDate transactionDate, double transactionAmount, String transactionType) {


        this.accountNumber = accountNumber;
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.transactionType = transactionType;

        transactionArrayList.add(this);
    }

    public void displayTransactions() {
        int accountNumber;
        System.out.printf("Enter account Number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("==========Transactions=========");
        for (int i = 0; i < transactionArrayList.size(); i++) {
            if (transactionArrayList.get(i).getAccountNumber() == accountNumber) {
                System.out.println(transactionArrayList.get(i));
            }

        }

    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID + "\n" +
                "Date: " + transactionDate + "\n" +
                "Account number: " + accountNumber + "\n" +
                "Amount: " + transactionAmount + "\n" +
                "Type: " + transactionType + "\n\n";
    }
}

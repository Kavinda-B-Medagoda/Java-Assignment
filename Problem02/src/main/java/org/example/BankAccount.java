package org.example;

import java.util.Iterator;
import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double accountBalance;
    private String accountType;

    Scanner scanner = new Scanner(System.in);


    public BankAccount() {

        do {
            System.out.print("Enter account number: ");
            int number = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            if (String.valueOf(number).length() > 5) {
                this.accountNumber = number;
                break;
            } else {
                System.out.println("Invalid account number! Please enter a number with more than 5 digits.");
            }
        } while (true);

        System.out.print("Enter holder name: ");
        this.setHolderName(scanner.nextLine());

        System.out.print("Enter account type: ");
        this.setAccountType(scanner.nextLine());

        do {
            System.out.print("Enter account balance: ");
            if (scanner.hasNextDouble()) {
                double balance = scanner.nextDouble();
                if (balance >= 0) {
                    this.setAccountBalance(balance);
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a non-negative balance.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        } while (true);


    }

    public BankAccount(int accountNumber, String holderName, double accountBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public BankAccount(int accountNumber, double amount) {
        Bank bank = new Bank();
        Iterator<BankAccount> iterator = bank.getAccountList().iterator();
        while (iterator.hasNext()){
            BankAccount account = iterator.next();
            if (account.getAccountNumber() == accountNumber){
                if (amount>=0){
                    setAccountBalance(amount + account.getAccountBalance());
                }
                else{
                    System.out.println("Enter valid amount");
                }
            }
            break;
        }
        System.out.println("Can't find account with " + accountNumber + " account number");

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

//    public void BankAccount(int accountNumber, double amount){

//    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
                "Holder Name: " + holderName + "\n" +
                "Balance: Rs." + accountBalance + "\n" +
                "Account Type: " + accountType + "\n\n" ;
    }
}



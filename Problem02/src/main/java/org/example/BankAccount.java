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
        Bank bank = new Bank();

        int userInput = 0;
        do {
            System.out.println("1. Add account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Back to main menu");
            System.out.printf("Enter your choice (1-4): ");

            if (scanner.hasNextInt()){
                userInput = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character
            }else{
                System.out.println("Invalid input! Please enter valid number.");
                continue;
            }

            switch (userInput){
                case 1:

                    bank.addAccount(createAccount());
                    break;

                case 2:
                    bank.depositMoney();
                    break;

                case 3:
                    bank.withdrawMoney();
                    break;
                default:
                    System.out.println("Please enter valid input!");
                    break;

            }
        }while (userInput != 4);
//        scanner.close();
    }

    public BankAccount(int accountNumber, String holderName, double accountBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public BankAccount(int accountNumber, double amount) {

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

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n" +
                "Holder Name: " + holderName + "\n" +
                "Balance: Rs." + accountBalance + "\n" +
                "Account Type: " + accountType + "\n\n" ;
    }

    public BankAccount createAccount(){

        int number;
        double balance ;
        String holderName;
        String accountType ;


        do {
            System.out.print("Enter account number: ");
             number = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
            if (String.valueOf(number).length() > 5) {

                break;
            } else {
                System.out.println("Invalid account number! Please enter a number with more than 5 digits.");
            }
        } while (true);

        System.out.print("Enter holder name: ");
         holderName = scanner.nextLine();
        System.out.print("Enter account type: ");
         accountType = scanner.nextLine();
        do {
            System.out.print("Enter account balance: ");
            if (scanner.hasNextDouble()) {
                 balance = scanner.nextDouble();
                 scanner.nextLine();
                if (balance >= 0) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a non-negative balance.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next();
            }
        } while (true);
        BankAccount bankAccount = new BankAccount(number,holderName,balance,accountType);
        System.out.println("Account created successfully!");
        return bankAccount;
    }

}



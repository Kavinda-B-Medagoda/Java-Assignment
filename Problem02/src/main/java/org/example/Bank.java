package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bank {

    Transaction transaction = new Transaction();
    Scanner scanner = new Scanner(System.in);
    private static List<BankAccount> accountList = new ArrayList<>();
    private static List<Customer> customersList = new ArrayList<>();

    public void addAccount(BankAccount bankAccount){
        accountList.add(bankAccount);
    }

    public void addCustomer(Customer customer){
        customersList.add(customer);
    }

    public List<BankAccount> getAccountList(){
        return accountList;
    }
    public void displayAccountInformation() {
        System.out.println("=======Account Information=======");
        if (accountList.isEmpty()){
            System.out.println("No accounts found!");
        }
        else
        {
            for (BankAccount account : accountList) {
                System.out.println(account);
            }
        }

    }

    public void displayCustomerInformation() {
        System.out.println("=======Customer Information======= \n");
        if (customersList.isEmpty()){
            System.out.println("No customers found!");
        }
        else{
            for (Customer customer : customersList) {
                System.out.println(customer);
            }
        }

    }

    public List<Customer> getCustomersList(){
        return customersList;
    }

    public void removeAccount(int accountNumber){
        Iterator<BankAccount> iterator = accountList.iterator();
        while (iterator.hasNext()){
            BankAccount account = iterator.next();
            if (account.getAccountNumber() == accountNumber){
                iterator.remove();
                System.out.println("Account removed successfully!");
                return;
            }
        }
        System.out.println("Account with account number " + accountNumber + " not found.");
    }

    public void removeCustomer(int customerId){
        Iterator<Customer> iterator = customersList.iterator();
        while (iterator.hasNext()){
            Customer customer = iterator.next();
            if (customer.getCustomerID() == customerId){
                iterator.remove();
                System.out.println("Customer removed successfully!");
                return;
            }
        }
        System.out.println("Customer with customer Id " + customerId + " not found.");
    }


    public void depositMoney() {
        System.out.print("Enter account number to update: ");
        int accountNumber = scanner.nextInt();

        // Find the index of the account in the ArrayList
        int index = -1;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber() == accountNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            // Update the balance of the specific BankAccount object
            BankAccount account = accountList.get(index);
            if (amount >= 0) {
                double newBalance = amount + account.getAccountBalance();
                account.setAccountBalance(newBalance);
//                transaction.addAccount();
                System.out.println("Balance updated successfully!");
            } else {
                System.out.println("Enter a valid amount.");
            }
        } else {
            System.out.println("Account not found with the given account number.");
        }
    }


    public void withdrawMoney() {
        System.out.print("Enter account number to withdraw: ");
        int accountNumber = scanner.nextInt();

        // Find the index of the account in the ArrayList
        int index = -1;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber() == accountNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            // Update the balance of the specific BankAccount object
            BankAccount account = accountList.get(index);
            if (amount >= 0) {
                if (amount > account.getAccountBalance()){
                    System.out.println("Not enough money");
                }
                else{
                    double newBalance =  account.getAccountBalance() - amount;
                    account.setAccountBalance(newBalance);
                    System.out.println("Balance updated successfully!");
                }

            } else {
                System.out.println("Enter a valid amount.");
            }
        } else {
            System.out.println("Account not found with the given account number.");
        }
    }

}

package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Bank {
    final Logger logger = LoggerFactory.getLogger(Bank.class);

    Transaction transaction = new Transaction();
    Scanner scanner = new Scanner(System.in);
    private static List<BankAccount> accountList = new ArrayList<>();

    public Bank() {
    }

    private static List<Customer> customersList = new ArrayList<>();

    public void addAccount(BankAccount bankAccount) {
        accountList.add(bankAccount);
    }

    public void addCustomer(Customer customer) {
        customersList.add(customer);
    }

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public void displayAccountInformation() {       //this method is for display all account available
        System.out.println("=======Account Information=======");

        if (accountList.isEmpty()) {
            logger.warn("No account found!");
//            System.out.println("No accounts found!");
        } else {
            for (BankAccount account : accountList) {
                System.out.println(account);
            }
        }

    }

    public void displayCustomerInformation() {      //this method is for display all customers available
        System.out.println("=======Customer Information======= \n");
        if (customersList.isEmpty()) {
            logger.warn("No customers found!");
        } else {
            for (Customer customer : customersList) {
                System.out.println(customer);
            }
        }

    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void removeAccount(int accountNumber) {       //to remove existing account
        Iterator<BankAccount> iterator = accountList.iterator();
        while (iterator.hasNext()) {
            BankAccount account = iterator.next();
            if (account.getAccountNumber() == accountNumber) {
                iterator.remove();
                logger.info("Account removed successfully!");
            }
        }
        logger.warn("Account with account number " + accountNumber + " not found.");
    }

    public void removeCustomer(int customerId) {     //to remove existing customer
        Iterator<Customer> iterator = customersList.iterator();
        while (iterator.hasNext()) {
            Customer customer = iterator.next();
            if (customer.getCustomerID() == customerId) {
                iterator.remove();
                logger.info("Customer removed successfully!");
            }
        }
        logger.warn("Customer with customer Id " + customerId + " not found.");
    }


    public void depositMoney() {        //deposit money to a account
        int accountNumber;
        double amount;
        try {
            System.out.print("Enter account number to update: ");
             accountNumber = scanner.nextInt();

            // Find the index of the account in the ArrayList
            int index = -1;
            for (int i = 0; i < accountList.size(); i++) {
                if (accountList.get(i).getAccountNumber() == accountNumber) {
                    index = i;
                    break;
                } else {
                    logger.warn("Can't find this account!");
                }
            }

            if (index != -1) {
                System.out.print("Enter amount to deposit: ");
                 amount = scanner.nextDouble();

                // Update the balance of the specific BankAccount object
                BankAccount account = accountList.get(index);
                if (amount >= 0) {
                    double newBalance = amount + account.getAccountBalance();
                    account.setAccountBalance(newBalance);
                    logger.info("Balance updated successfully!");
                    Transaction transaction = new Transaction(accountNumber,1, LocalDate.now(),amount,"Deposit");


                } else {
                    System.out.println("Enter a valid amount.");
                }
            } else {
                System.out.println("Account not found with the given account number.");
            }
        } catch (Exception e) {
            logger.error("Error : " + e.getMessage());
        }
    }


    public void withdrawMoney() {       //withdraw money from an account
        try {
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
                    if (amount > account.getAccountBalance()) {
                        logger.warn("Not enough money");
                    } else {
                        double newBalance = account.getAccountBalance() - amount;
                        account.setAccountBalance(newBalance);
                        logger.info("Balance updated successfully!");
                        Transaction transaction = new Transaction(accountNumber,1, LocalDate.now(),amount,"Withdraw");

                    }

                } else {
                    System.out.println("Enter a valid amount.");
                }
            } else {
                System.out.println("Account not found with the given account number.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

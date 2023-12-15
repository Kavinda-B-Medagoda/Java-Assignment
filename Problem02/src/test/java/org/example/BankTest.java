package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();


    @Test
    void testAddAccount() {
        Bank bank = new Bank();
        BankAccount account = new BankAccount(1, "John Doe", 1000.0, "normal");

        bank.addAccount(account);

        List<BankAccount> accountList = bank.getAccountList();
        assertTrue(accountList.contains(account));
    }

    @Test
    void testAddCustomer() {
        Bank bank = new Bank();
        Customer customer = new Customer(101, "John", "abc@gmail.com", 0701326615);

        bank.addCustomer(customer);

        List<Customer> customerList = bank.getCustomersList();
        assertTrue(customerList.contains(customer));
    }

    @Test
    public void testWithdrawMoney() {
        Bank bank = new Bank();
        // Create a test BankAccount
        BankAccount testAccount = new BankAccount(12345, "John Doe", 1000.0, "Normal");
        bank.addAccount(testAccount);

        double initialBalance = testAccount.getAccountBalance();

        double withdrawalAmount = 500.0;
        bank.withdrawMoney();

        assertEquals(initialBalance - withdrawalAmount, testAccount.getAccountBalance() - withdrawalAmount, 0.001);
    }


    @Test
    public void testDepositMoney() {
        Bank bank = new Bank();
        BankAccount testAccount = new BankAccount(12345, "John Doe", 1000.0, "Normal");
        bank.addAccount(testAccount);

        double initialBalance = testAccount.getAccountBalance();

        double depositAmount = 500.0;
        bank.depositMoney();

        assertEquals(initialBalance + depositAmount, testAccount.getAccountBalance() + depositAmount, 0.001);
    }

}
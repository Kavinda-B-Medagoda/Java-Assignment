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
        Customer customer = new Customer(101, "John","abc@gmail.com", 0701326615);

        bank.addCustomer(customer);

        List<Customer> customerList = bank.getCustomersList();
        assertTrue(customerList.contains(customer));
    }

    @Test
    void testDisplayCustomerInformation() {
        // Arrange
        Bank bank = new Bank();
        Customer customer = new Customer(101, "John", "abc@gmail.com", 0701326615);
        bank.addCustomer(customer);

        // Act
        bank.displayCustomerInformation();

        // Assert
        assertTrue(outputStream.toString().contains("=======Customer Information======= \n" + customer.toString()));
    }


}
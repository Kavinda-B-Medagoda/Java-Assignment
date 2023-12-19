package org.example;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        final Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        int userChoise = 0;
        try {
            do {

                System.out.println("=================Select a Service=================");
                System.out.println("1. Account");
                System.out.println("2. Add customer");
                System.out.println("3. Show all accounts");
                System.out.println("4. Show all customers");
                System.out.println("5. Remove account");
                System.out.println("6. Remove customer");
                System.out.println("7. View transactions");
                System.out.println("8. Exit");
                System.out.printf("Enter your choice (1-8): ");

                if (scanner.hasNextInt()) {
                    userChoise = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                } else {
                    logger.warn("Invalid input! Please enter valid number.");
                    continue;
                }

                switch (userChoise) {
                    case 1:
                        BankAccount bankAccount = new BankAccount();
                        break;

                    case 2:
                        Customer customer = new Customer();
                        bank.addCustomer(customer);
                        break;

                    case 3:
                        bank.displayAccountInformation();
                        break;

                    case 4:
                        bank.displayCustomerInformation();
                        break;

                    case 5:
                        System.out.print("Enter the account number:");
                        bank.removeAccount(scanner.nextInt());
                        break;

                    case 6:
                        System.out.print("Enter the customer ID:");
                        bank.removeCustomer(scanner.nextInt());
                        break;

                    case 7:
                        Transaction transaction = new Transaction();
                        transaction.displayTransactions();
                        break;

                    default:
                        System.out.println("Please enter valid input!");
                }
            }
            while (userChoise != 8);
            scanner.close();
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
        }
    }
}
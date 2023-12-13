package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("7. Exit");
        System.out.printf("Enter your choice (1-7): ");

        if (scanner.hasNextInt()) {
            userChoise = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character
        } else {
            System.out.println("Invalid input! Please enter valid number.");
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

            default:
                System.out.println("Please enter valid input!");
        }
    }
    while (userChoise != 7);
    scanner.close();
}catch (Exception e){
    System.out.println("Error: "+ e.getMessage());
}
    }
}
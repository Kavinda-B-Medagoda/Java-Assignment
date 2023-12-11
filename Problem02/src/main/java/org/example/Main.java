package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userChoise = 0;

        do {
            System.out.println("=================Select a Service=================");
            System.out.println("1. Add account");
            System.out.println("2. Add customer");
            System.out.println("3. Show all accounts");
            System.out.println("4. Show all customers");
            System.out.println("5. Remove account");
            System.out.println("6. Remove customer");
            System.out.println("7. Deposit money");
            System.out.println("8. Exit");
            System.out.printf("Enter your choice (1-6): ");

            if (scanner.hasNextInt()){
                userChoise = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

            }else{
                System.out.println("Invalid input! Please enter valid number.");
                continue;
            }

            switch (userChoise){
                case 1:
                    BankAccount bankAccount = new BankAccount();
                    Bank bank = new Bank();
                    bank.addAccount(bankAccount);
                    break;

                case 2:
                    Customer customer = new Customer();
                    Bank bank1 = new Bank();
                    bank1.addCustomer(customer);
                    break;

                case 3:
                    Bank bank2 = new Bank();
                    bank2.displayAccountInformation();
                    break;

                case 4:
                    Bank bank3 = new Bank();
                    bank3.displayCustomerInformation();
                    break;

                case 5:
                    Bank bank4 = new Bank();
                    System.out.print("Enter the account number:");
                    bank4.removeAccount(scanner.nextInt());
                    break;

                case 6:
                    Bank bank5 = new Bank();
                    System.out.print("Enter the customer ID:");
                    bank5.removeCustomer(scanner.nextInt());
                    break;

                case 7:
                    System.out.printf("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.printf("Enter amount: ");
                    double amount = scanner.nextDouble();
                    BankAccount bankAccount1 = new BankAccount(accountNumber,amount);
//                    bankAccount1.depositMoney();
                    break;

                default:
                    System.out.println("Please enter valid input!");

            }
        }
        while (userChoise != 8);
        scanner.close();

    }
}
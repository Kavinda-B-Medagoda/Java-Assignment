package org.example;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {
    final Logger logger = LoggerFactory.getLogger(Customer.class);

    private int customerID;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    Scanner scanner = new Scanner(System.in);

    public Customer() {     //this constructor add a customer to the bank using the method in Bank class
        try {
            do {
                System.out.printf("Enter customer ID: ");
                int ID = scanner.nextInt();
                if (String.valueOf(ID).length() < 5) {
                    logger.warn("Customer id must have more than 4 characters!");
                } else {
                    this.setCustomerID(ID);
                    break;
                }
                scanner.nextLine();
            } while (true);

            System.out.printf("Enter customer name: ");
            this.setCustomerName(scanner.nextLine());

            do {
                System.out.printf("Enter customer phone number: ");
                int phoneNumber = scanner.nextInt();
                if (String.valueOf(phoneNumber).length() != 10) {
                    logger.warn("Please enter phone number with 10 digits");
                } else {
                    this.setPhoneNumber(phoneNumber);
                    break;
                }
                scanner.nextLine();
            }
            while (true);

            do {
                System.out.printf("Enter customer email address: ");
                String email = scanner.nextLine();
                if (email.contains("@") && email.contains(".")) {
                    logger.warn("Enter valid email");
                } else {
                    this.setEmailAddress(email);
                    break;
                }
            } while (true);


        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
        }

    }

    public Customer(int customerID, String customerName, String emailAddress, int phoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID + "\n" +
                "Name: " + customerName + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Email: " + emailAddress + "\n\n";
    }


}

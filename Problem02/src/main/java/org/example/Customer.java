package org.example;

import java.util.Scanner;

public class Customer {
    private int customerID;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    Scanner scanner = new Scanner(System.in);

    public Customer() {     //this constructor add a customer to the bank using the method in Bank class
        try {
            System.out.printf("Enter customer ID: ");
            this.setCustomerID(scanner.nextInt());
            scanner.nextLine();

            System.out.printf("Enter customer name: ");
            this.setCustomerName(scanner.nextLine());

            System.out.printf("Enter customer phone number: ");
            this.setPhoneNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.printf("Enter customer email address: ");
            this.setEmailAddress(scanner.nextLine());

        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
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
                "Email: " + emailAddress + "\n\n" ;
    }


}

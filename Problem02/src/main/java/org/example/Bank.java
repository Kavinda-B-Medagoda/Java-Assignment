package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
    private static List<BankAccount> accountList = new ArrayList<>();
    private static List<Customer> customersList = new ArrayList<>();

//    public Bank() {
//    }

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


}

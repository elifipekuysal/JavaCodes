package com.eipe;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    // Constructor chaining, second constructor has the "responsibility" to initialize the variables
    public BankAccount () {
        this("Default accountNumber", 0.0, "Default customerName", "Default email", "Default phoneNumber");
        System.out.println("Empty constructor called."); }

    public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds (double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance = " + this.balance);
    }

    public void withdrawFunds (double withdraw) {
        if(this.balance >= withdraw) {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance = " + this.balance);
        } else {
            System.out.println("Only "+ this.balance + " available. Withdrawal not processed.");
        }
    }
}

package com.eipe;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        account1.setAccountNumber("123");
        account1.setBalance(1000);
        account1.setCustomerName("Sarah Jones");
        account1.setEmail("sarahjones@xmail.com");
        account1.setPhoneNumber("1234567890");

        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Customer name: " + account1.getCustomerName());
        System.out.println("E-mail: " + account1.getEmail());
        System.out.println("Phone number: " + account1.getPhoneNumber());

        account1.depositFunds(1000);
        account1.withdrawFunds(2000);

        System.out.println();

        BankAccount account2 = new BankAccount("234", 2000, "George Pol", "georgepol@xmail.com", "2345678901");

        System.out.println("Account number: " + account2.getAccountNumber());
        System.out.println("Balance: " + account2.getBalance());
        System.out.println("Customer name: " + account2.getCustomerName());
        System.out.println("E-mail: " + account2.getEmail());
        System.out.println("Phone number: " + account2.getPhoneNumber());

        account2.depositFunds(500);
        account2.withdrawFunds(800);

        System.out.println();

        //****************************************************

        VipCustomer vip1 = new VipCustomer();
        VipCustomer vip2 = new VipCustomer("X Person", 9999.0);
        VipCustomer vip3 = new VipCustomer("Y Person", 9999.0, "yperson@xmail.com");

        System.out.println(vip1.getName());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmail());

        System.out.println();

        System.out.println(vip2.getName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip2.getEmail());

        System.out.println();

        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmail());
    }
}

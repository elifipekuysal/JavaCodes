package com.eipe;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer () {
        this("Default name", 0.0, "Default email");  // Call to the constructor which is implemented in the same class
        System.out.println("Empty constructor.");                                    //   |
    }                                                                                //   |
                                                                                     //   |
    public VipCustomer (String name, double creditLimit) {                           //   |
        this(name, creditLimit, "unknownmail@xmail.com");                     //    |
    }                                                                                 //  |
                                                                                      //  |
    public  VipCustomer (String name, double creditLimit, String email) {        //  <-----
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

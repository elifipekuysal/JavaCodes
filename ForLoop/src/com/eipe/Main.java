package com.eipe;

public class Main {

    public static void main(String[] args) {
        double amount = 10000;

	    for (int i = 2 ; i <= 8 ; i++) {
            System.out.println(amount + " at %" + i + "interest = " + calculateInterest(amount, i));
        }
        System.out.println("");

        for (int i = 8 ; i >= 2 ; i--) {
            System.out.println(amount + " at %" + i + "interest = " + calculateInterest(amount, i));
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}

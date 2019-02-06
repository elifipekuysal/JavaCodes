package com.eipe;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int numberInt = Integer.parseInt(numberAsString);
        System.out.println("numberInt = " + numberInt);

        numberAsString += 1;
        System.out.println("numberAsString = " + numberAsString);

        numberInt += 1;
        System.out.println("numberInt = " + numberInt);

        numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double numberDouble = Double.parseDouble(numberAsString);
        System.out.println("numberDouble = " + numberDouble);

        numberAsString += 1;
        System.out.println("numberAsString = " + numberAsString);

        numberDouble += 1;
        System.out.println("numberDouble = " + numberDouble);
    }
}

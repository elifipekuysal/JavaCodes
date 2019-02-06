package com.eipe;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f;

        // width of double = 64 (8 bytes)
        double myDoubleValue= 5d;


        // It is recommended to use double data type than using float data type.
        //Because double is more precise and faster in many modern computers.
        // Math functions use doubles.
        double secondDoubleValue = 5.4;
        float secondFloatValue= 5.4f;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        System.out.println("secondDoubleValue = " + secondDoubleValue);
        System.out.println("secondFloatValue = " + secondFloatValue);

        int intDivisionValue = (myIntValue / 3);
        float floatDivisionValue = (myFloatValue / 3f);
        double doubleDivisionValue = (myDoubleValue / 3d);

        System.out.println("intDivisionValue = " + intDivisionValue);
        System.out.println("floatDivisionValue = " + floatDivisionValue);
        System.out.println("doubleDivisionValue = " + doubleDivisionValue);

        double numPound = 200d;
        double numKg = numPound * (0.45359237d);
        System.out.println("numKg = " + numKg);

    }
}

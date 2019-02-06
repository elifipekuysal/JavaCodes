package com.eipe;

public class Main {

    public static void main(String[] args) {

        // width of 16 (2 bytes)
        char myChar = 'A';
        char mySecondChar = '\u00A9';  // Unicode character (from unicode table)
        System.out.println("myChar = " + myChar);
        System.out.println("mySecondChar = " + mySecondChar);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;


        char myThirdChar = '\u00AE';
        System.out.println("Unicode character: " + myThirdChar);

    }
}

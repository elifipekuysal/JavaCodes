package com.eipe;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myNewIntValue = (myMinValue/2);
        System.out.println("myNewIntValue = " + myNewIntValue);

        // short has a width of 16
        short myShortValueMin = -32768;
        short myShortValueMax = 32767;
        short myNewShortValue = (short) (myShortValueMin/2);  //Casting
        System.out.println("myNewShortValue = " + myNewShortValue);

        // byte has a width of 8
        byte myByteValueMin = -128;
        byte myByteValueMax = 127;
        byte myNewByteValue = (byte) (myByteValueMin/2);  //Casting
        System.out.println("myNewByteValue = " + myNewByteValue);

        // long has a width of 64
        long myLongValue = 100L;   //It is better to use capital "L" letter for easier readability
        long myLongValueMin = -9_223_372_036_854_775_808L;
        long myLongValueMax = 9_223_372_036_854_775_807L;  // 2^63
        long myNewLongValue = (myLongValueMin/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        byte byteVar = 99;
        short shortVar = -24354;
        int intVar = 984324785;

        long longTotal = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println("longTotal = " + longTotal);

        short shortTotal = (short) (50000 + 10 * (byteVar + shortVar + intVar));
        System.out.println("shortTotal = " + shortTotal);
    }
}

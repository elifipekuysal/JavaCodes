package com.eipe;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(20, 0);  // 20ft= 609.6000cm
        calcFeetAndInchesToCentimeters(6, 2);  // 6ft 2in= 187.9600cm
        calcFeetAndInchesToCentimeters(2);  // 0ft 2in= 5.080000cm
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        double cm = 0;

        if(feet >= 0 && inches >= 0 && inches <=12) {
            cm = feet * 12 * 2.54 + inches * 2.54;

            System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm.");

            return cm;
        }

        System.out.println("Invalid value of feet or inches!");
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {

        if(inches >= 0) {
            double feet = (int) inches / 12;
            inches = (int) inches % 12;

            return calcFeetAndInchesToCentimeters(feet, inches);
        }

        System.out.println("Invalid value of inches!");
        return -1;
    }
}

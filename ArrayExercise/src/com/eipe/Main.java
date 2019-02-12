package com.eipe;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("This program will find the sum of an array's elements which are assigned via inputs.");
        System.out.println("Please enter the array length within the range (0, 20]: ");

        int arrLength = scanner.nextInt();  // Taking user input for defining array's length
        while(arrLength <= 0 || arrLength > 20) {  // If User's input is not in the range then ask for a new input
            System.out.println("Array length should be within the range (0, 20]!");
            System.out.println("Please enter again: ");
            arrLength = scanner.nextInt();
        }

        int[] array  = new int[arrLength];

        getArrayElementsFindSumAndAverage(array);

        scanner.close();
    }

    private static void getArrayElementsFindSumAndAverage(int[] array) {
        System.out.println("Please enter " + array.length + " values for the array.");

        int sum = 0;  // Variable for storing sum of the array elements

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  // Taking user input for assigning values to array elements
            sum += array[i];
        }
        System.out.println("Sum of the array elements is = " + sum);
        System.out.println("Average is = " + ((double) sum / (double) array.length));
    }

}

package com.eipe;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = getIntegers();
        System.out.print("Array = ");
        printArray(arr);

        int[] sortedArr= sortArray(arr);
        System.out.print("Sorted array = ");
        printArray(sortedArr);

        scanner.close();
    }

    private static int[] getIntegers () {

        System.out.println("Please enter the array length within the range (0, 50]: ");

        int arrLength = scanner.nextInt();  // Taking user input for defining array's length
        while(arrLength <= 0 || arrLength > 50) {  // If User's input is not in the range then ask for a new input
            System.out.println("Array length should be within the range (0, 50]!");
            System.out.println("Please enter again: ");
            arrLength = scanner.nextInt();
        }

        int[] array  = new int[arrLength];

        System.out.println("Please enter " + array.length + " values for the array.");


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  // Taking user input for assigning values to array elements
        }

        return array;
    }

    private static int[] sortArray (int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < (sortedArray.length - 1); i++) {
                if (sortedArray[i] < sortedArray [i + 1]) {
                    temp= sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();;
    }
}

package com.eipe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the length of the array: ");
        int count = scanner.nextInt();

        int[] array = readIntegers(count);
        System.out.println("Array is = " + Arrays.toString(array));

        int min = findMin(array);
        System.out.println("min element of the array is = " + min);
    }

    private static int[] readIntegers(int count) {
        System.out.print("Enter " + count + " values for the array: ");
        int[] array = new int[count];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];

        for(int i = 1; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }
}

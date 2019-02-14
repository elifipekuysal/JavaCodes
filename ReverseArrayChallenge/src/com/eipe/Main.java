package com.eipe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the length of the array: ");
        int lengthOfTheArray = scanner.nextInt();

        int[] array = new int[lengthOfTheArray];

        System.out.println("Enter " + lengthOfTheArray + " values for the elements of the array: ");

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Non-reversed array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {
        int temp;

        for(int i = 0; i < (array.length / 2); i++) {
            temp = array[((array.length - 1) - i)];
            array[((array.length - 1) - i)] = array[i];
            array[i] = temp;
        }
    }
}

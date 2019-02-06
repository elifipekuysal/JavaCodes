package com.eipe;

public class Main {

    public static void main(String[] args) {
        int number = 4;
        int endNum = 20;

        int count = 0;

        while(number <= endNum) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println(number + " is an even number.");

            if(count == 5) {
                break;
            }
        }

        System.out.println(count + " even numbers found.");

    }

    private static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}

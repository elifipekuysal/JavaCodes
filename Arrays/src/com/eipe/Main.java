package com.eipe;

public class Main {

    public static void main(String[] args) {
        int[] intArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};  //It can just be used when array is first defined

        int[] intArray2 = new int[10];

        //intArray2[0] = 1;
        // ...
        //intArray2[9] = 10;

        for (int i = 0; i < 10; i++) {
            intArray2[i] = i + 1;
        }

        for (int c = 0; c < intArray1.length; c++) {
            System.out.println("intArray1[" + c + "] = " + intArray1[c]);
        }

        System.out.println();

        for (int c = 0; c < intArray2.length; c++) {
            System.out.println("intArray2[" + c + "] = " + intArray2[c]);
        }
    }
}

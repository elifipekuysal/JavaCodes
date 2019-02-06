package com.eipe;

public class Main {

    public static void main(String[] args) {
        char switchValChar = ' ';

        switch(switchValChar) {
            case 'A':
                System.out.println("switchValChar is: A");
                break;

            case 'B':
                System.out.println("switchValChar is: B");
                break;

            case 'C':
                System.out.println("switchValChar is: C");
                break;

            case 'D':
                System.out.println("switchValChar is: D");
                break;

            case 'E':
                System.out.println("switchValChar is: E");
                break;

            default:
                System.out.println("switchValChar is not A, B, C, D or E.");
                break;
        }

    }
}

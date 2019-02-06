package com.eipe;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is a string";
        System.out.println("String is: \"" + myString + "\"");

        myString = myString + ", and this is more. ";
        System.out.println("New string is: \"" + myString + "\"");

        myString = myString + '\u00A9' + " 2019.";  // myString + "\u00A9 2019." will give the same result
        System.out.println("New string is: \"" + myString + "\"");

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Number string is: " + numberString);

        String lastString = "10";
        int myIntValue = 50;
        lastString = lastString + myIntValue;
        System.out.println("Last string is: " + lastString);

        double myDoubleValue = 120.47;
        lastString = lastString + myDoubleValue;
        System.out.println("Last string is: " + lastString);
    }
}

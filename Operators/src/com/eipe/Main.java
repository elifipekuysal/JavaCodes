package com.eipe;

public class Main {

    public static void main(String[] args) {
        int result = 9 + 9;
        System.out.println("9 + 9 = " + result);

        int previousResult = result;
        result = result - 7;
        System.out.println(previousResult + " - 7 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now: " + result);

        result++;
        System.out.println("Result is now: " + result);

        result--;
        System.out.println("Result is now: " + result);

        result += 2;
        System.out.println("result += 2: " + result);

        result *= 4;
        System.out.println("result *= 4: " + result);

        result -= 10;
        System.out.println("result -= 10: " + result);

        result /= 6;
        System.out.println("result /= 6: " + result);


        boolean isAlien = false;  // Assign operator
        if(isAlien == false)    // Equals
            System.out.println("It is not an alien!");

        int  topScore = 100;
        if(topScore != 100)    // Not equals
            System.out.println("You couldn't got the high score!");

        if(topScore >= 100)    // Not equals
            System.out.println("You got the high score!");

        if(topScore < 100)    // Not equals
            System.out.println("Your score is less than 100!");

        int secondScore = 50;
        int thirdScore = 90;
        if((secondScore < 60) && (thirdScore > 80))
            System.out.println("Second score is less than 60 AND third score is greater than 80.");

        if((secondScore < 60) || (thirdScore < 70))
            System.out.println("Second score is less than 60 OR third score is less than 70.");


        boolean isCar = true;
        boolean wasCar = isCar ? true: false;  // Ternary operator
        if(wasCar)
            System.out.println("wasCar is true.");


        double var1 = 20d;
        double var2 = 80d;
        double total= (var1 + var2) * 25;
        if(total % 40 <= 20)
            System.out.println("Total was over the limit!");


    }
}

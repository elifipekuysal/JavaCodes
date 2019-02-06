package com.eipe;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplated = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score is 5000");
            System.out.println("This will be executed if only score equals to 5000");
        }

        System.out.println("This will always be executed");


        // gameOver == true
        if (gameOver) {
            int finalScore = score + levelComplated * bonus;

            if (finalScore >= 5000) {
                System.out.println("You completed all the levels. Congratulations!");
            }
            else if (levelComplated >= 1 && levelComplated <5) {
                System.out.println("Try harder to complete all the levels. Fighting!");
            }
            else {
                System.out.println("Uh-oh you lost. Try again!");
            }
        }


    }
}

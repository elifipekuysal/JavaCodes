package com.eipe;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("Your final score is: " + calculateScore(gameOver, score, levelCompleted, bonus));
        System.out.println("Your final score is: " + calculateScore(true,10000, 8, 200));
        System.out.println("Your final score is: " + calculateScore(false,15000, 11, 300));


        String playerName;
        int position;

        playerName = "Player1";
        position = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, position);

        playerName = "Player2";
        position = calculateHighScorePosition(900);
        displayHighScorePosition(playerName, position);

        playerName = "Player3";
        position = calculateHighScorePosition(400);
        displayHighScorePosition(playerName, position);

        playerName = "Player4";
        position = calculateHighScorePosition(50);
        displayHighScorePosition(playerName, position);
    }

    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        // gameOver == true
        if (gameOver) {
            int finalScore = score + levelCompleted * bonus;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition (String playerName, int position) {
        System.out.println(playerName + ", Managed to get into position: " + position);
    }

    public static int calculateHighScorePosition (int score) {
        int position = 4;

        if(score >= 1000) {
            position = 1;
        }
        else if(500 <= score) {
            position = 2;
        }
        else if (100 <= score) {
            position = 3;
        }

        return position;
    }

}

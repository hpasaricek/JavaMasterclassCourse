package com.company;

public class Main {

    public static void main(String[] args) {
        int highScorePosition;

        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Hrvoje", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ivan", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Domagoj", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Marko", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        //drugi način rješenja
        int position;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}


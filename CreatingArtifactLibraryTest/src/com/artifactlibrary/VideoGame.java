package com.artifactlibrary;

public class VideoGame {
    private String gameName;
    private int gameReview;

    public VideoGame(String gameName, int gameReview) {
        this.gameName = gameName;
        this.gameReview = gameReview;
    }

    public void displayGrade() {
        if (gameReview < 60) {
            System.out.println("Mediocre game.");
        } else if (gameReview < 70) {
            System.out.println("Average game.");
        } else if (gameReview < 80) {
            System.out.println("Good game");
        } else if (gameReview < 90) {
            System.out.println("Great game");
        } else {
            System.out.println("Amazing game.");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // 4 % 3 = 1 remainder
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++; // 1 + 1
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        } else {
            System.out.println("Not a high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true!");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;

        if (!isCar) {
            System.out.println("Always true!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 17;

        String isEighteenOrOver = (ageOfClient >=18) ? "Buy some beer!" : "Buy some chocolate milk!";
        System.out.println(isEighteenOrOver);

        if (2 + 2 * 2 == 8) {
            System.out.println("8");
        } else {
            System.out.println("6");
        }



    }
}

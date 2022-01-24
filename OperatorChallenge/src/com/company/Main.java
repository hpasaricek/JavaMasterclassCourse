package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double num1 = 20.00;
        double num2 = 80.00;

        double result = (num1 + num2) * 100.00;

        boolean remainder = result % 40.00 == 0 ? true : false;
        System.out.println(remainder);

        if (!remainder) {
            System.out.println("Got some remainder!");
        }

    }
}

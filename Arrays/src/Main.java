import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = getIntegers(5);
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Number " + i + ". = " + myIntArray[i]);
        }

        System.out.println("Average is " + getAverage(myIntArray));
    }

    public static int[] getIntegers(int number) {
        int[] myIntArray = new int[number];
        System.out.println("Enter " + number + " numbers");
        for (int i = 0; i < number; i++) {
            myIntArray[i] = scanner.nextInt();
        }

        return myIntArray;
    }

    public static double getAverage(int[] myIntArray) {
        int sum = 0;
        for (int i = 0; i < myIntArray.length; i++) {
            sum += myIntArray[i];
        }

        return (double) sum / myIntArray.length;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        displayArray(sortIntegers(getIntegers()));
    }

    public static int[] getIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");

        int number = scanner.nextInt();
        int[] intArray = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Enter " + (i + 1) + ". number:");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    public static void displayArray(int[] intArray) {
        int count = 1;
        for (Integer integer : intArray) {
            System.out.println("Number " + count + ". is: " + integer);
            count++;
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        //Using bubble sort
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < (intArray.length) - i; j++) {
                if (intArray[j-1] < intArray[j]) {
                 temp = intArray[j-1];
                 intArray[j-1] = intArray[j];
                 intArray[j] = temp;
                }
            }
        }
        return intArray;
    }
}

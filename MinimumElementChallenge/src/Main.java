import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many numbers do you want to enter?");

        System.out.println("Min number of array is: " + findMin(readIntegers(scanner.nextInt())));

    }

    private static int[] readIntegers(int count) {
        int[] intArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter " + (i+1) + ". number: ");
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] intArray) {
        Arrays.sort(intArray);
        return intArray[0];
    }
}

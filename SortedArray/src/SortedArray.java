import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int numOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element " + i + " contents " + intArray[i]);
        }
    }

    public static int[] sortIntegers(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < intArray.length - i; j++) {
                if (intArray[j] > intArray[j - 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j - 1];
                    intArray[j - 1] = temp;
                }
            }
        }
        return intArray;
    }
}

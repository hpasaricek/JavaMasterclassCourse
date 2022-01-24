import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] readElements(int num) {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[num];

        for (int i = 0; i < num; i++) {
            intArray[i] = scanner.nextInt();
        }

        return intArray;
    }

    private static int findMin(int[] intArray) {
        Arrays.sort(intArray);
        return intArray[0];
    }
}

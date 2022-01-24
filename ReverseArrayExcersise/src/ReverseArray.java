import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] intArray) {
        System.out.println("Array = " + Arrays.toString(intArray));

        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[intArray.length - i - 1];
            intArray[intArray.length - i - 1] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(intArray));
    }
}

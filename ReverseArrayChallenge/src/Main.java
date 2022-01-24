public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        reverse(intArray);
        for (Integer integer : intArray) {
            System.out.println(integer);
        }
    }

    private static void reverse(int[] intArray) {
        //First solution
        /*int temp;
        for (int i = 0; i < (intArray.length / 2); i++) {
            temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }*/

        //Other solution
        /*for (int left = 0, right = intArray.length - 1; left < right; left++, right--) {
            int temp1 = intArray[left];
            intArray[left] = intArray[right];
            intArray[right] = temp1;
        }*/

        //Other solution with while
        int left = 0;
        int right = intArray.length - 1;

        while (left < right) {
            int temp = intArray[left];
            intArray[left] = intArray[right];
            intArray[right] = temp;

            left++;
            right--;
        }
    }
}

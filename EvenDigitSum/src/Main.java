public class Main {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(34512));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sumOfEvenDigits = 0;

        while (number != 0) {
            if ((number % 10) % 2 == 0) {
                sumOfEvenDigits += number % 10;
            }
            number /= 10;
        }

        return sumOfEvenDigits;
    }
}

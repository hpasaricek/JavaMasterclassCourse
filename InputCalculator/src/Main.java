import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long average = 0;
        int number;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                sum += number;
                count++;
                average = Math.round((float)(sum) / count);
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
    }
}

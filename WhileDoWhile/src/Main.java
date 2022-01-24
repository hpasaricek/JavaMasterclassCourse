public class Main {
    public static void main(String[] args) {
        int count = 1;

        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count values was " + count);
            count++;
        } while (count != 6);

        /////////////////////////////////////////////////////

        int number = 4;
        int finishNumber = 20;
        int countEvenNumbers = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            countEvenNumbers++;
            if (countEvenNumbers == 5) {
                break;
            }
        }

        System.out.println("Total number of even numbers is: " + countEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

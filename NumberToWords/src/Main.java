public class Main {
    public static void main(String[] args) {
        numberToWords(11);
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            while (reversedNumber != 0) {
                switch (reversedNumber % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid Number");
                        break;
                }
                reversedNumber /= 10;
            }
        }
        reversedNumber = reverse(number);

        if (getDigitCount(number) != getDigitCount(reversedNumber)) {
            for (int i = 0; i < (getDigitCount(number) - getDigitCount(reversedNumber)); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int lastDigit;
        int reverseNumber = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }
}

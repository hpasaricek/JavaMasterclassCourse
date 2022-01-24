public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        int maxPrimeNumber = 0;

        if (number < 2) {
            return -1;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i  % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    maxPrimeNumber = i;
                }
            }
        }
        return maxPrimeNumber;
    }
}

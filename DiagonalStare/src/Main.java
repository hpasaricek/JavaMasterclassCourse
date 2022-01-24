public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number) {
                        System.out.print("*");
                    } else if ((j == 1) || (j == number)) {
                        System.out.print("*");
                    } else if (j == i) {
                        System.out.print("*");
                    } else if (j == (number - i) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}

    /*public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();

            for (int i = 2; i < number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((j == 1) || (j == number)) {
                        System.out.print("*");
                    } else if (j == i) {
                        System.out.print("*");
                    } else if (j == (number - i) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
        }
    }*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is: " + name);
                System.out.println("You are: " + (2020 - birthYear));
            } else {
                System.out.println("Something went wrong!");
            }
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}

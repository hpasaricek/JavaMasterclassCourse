import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, String> sapcodes = new HashMap<>();
    private static Integer codeNumber = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printOptions();
    }

    private static void printOptions() {
        boolean isOn = true;
        System.out.println("Available options are:");
        System.out.println("1. Add new SAP code." + "\n" +
                "2. View existing codes." + "\n" +
                "3. Delete existing code." + "\n" +
                "4. Exit.");

        while (isOn) {
            System.out.println("Enter your option:");
            Integer choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addCode();
                    break;
                case 2:
                    displayCodes();
                    break;
                case 3:
                    deleteCode();
                    break;
                case 4:
                    isOn = false;
                    break;
            }
        }
    }

    private static void addCode() {
        System.out.println("Enter code description:");
        String description = scanner.nextLine();
        if (findCode(description)) {
            System.out.println("Code with that description already exists. Code not added!");
            return;
        }
        sapcodes.put(codeNumber, description);
        System.out.println("Successfully added new code.");
        codeNumber++;

    }

    private static void displayCodes() {
        System.out.println("Code number" + "\tDescription");
        for (Map.Entry<Integer, String> entrySet : sapcodes.entrySet()) {
            System.out.println(entrySet.getKey() + "\t" + entrySet.getValue());
        }
    }

    private static void deleteCode() {
        System.out.println("Enter code number to delete:");
        Integer codeNumber = scanner.nextInt();

        if (!sapcodes.containsKey(codeNumber)) {
            System.out.println("The code number doesn't exist.");
            return;
        }

        sapcodes.remove(codeNumber);
        System.out.println("Code number " + codeNumber + " deleted.");
    }

    private static boolean findCode(String description) {
        return sapcodes.containsValue(description);
    }

}

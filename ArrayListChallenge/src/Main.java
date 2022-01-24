import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            mobilePhone.displayPhoneOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    mobilePhone.printContacts();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Entered wrong number. Try again!");
                    break;
            }
        }
    }

    private static void addContact(){
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter contact number:");
        int number = scanner.nextInt();
        mobilePhone.addNewContact(name,number);
    }

    private static void updateContact(){
        System.out.println("Enter old contact name:");
        String oldName = scanner.nextLine();
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number:");
        int newNumber = scanner.nextInt();
        mobilePhone.updateContact(oldName, newName, newNumber);
    }

    private static void removeContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void findContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        mobilePhone.findContact(name);
    }
}

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;

        while (!quit) {
            System.out.println("-----------------");
            mobilePhone.displayOptions();
            System.out.println("-----------------");
            System.out.println("Choose your option:");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addNewContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    printContacts();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Wrong choice entered. Try again!");
                    break;
            }
        }
    }

    public static void addNewContact() {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String number = scanner.nextLine();
        if (mobilePhone.addNewContact(new Contact(name, number))) {
            System.out.println("Succesfully created new contact.");
        } else {
            System.out.println("Contact already exists.");
        }
    }

    public static void updateContact() {
        System.out.println("Enter existing contact name:");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);

        if (oldContact != null) {
            System.out.println("Enter new contact name:");
            String newName = scanner.nextLine();
            System.out.println("Enter new phone number:");
            String newNumber = scanner.nextLine();
            if (mobilePhone.updateContact(oldContact, new Contact(newName, newNumber))) {
                System.out.println("Successfully updated contact.");
            }
        } else {
            System.out.println("The contact name you entered hasn't been found.");
        }
    }

    public static void removeContact() {
        System.out.println("Enter existing contact name:");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);

        if (oldContact != null) {
            mobilePhone.removeContact(oldContact);
            System.out.println("Successfully removed contact.");

        } else {
            System.out.println("The contact name you entered hasn't been found.");
        }
    }

    public static void queryContact() {
        System.out.println("Enter contact name:");
        String name = scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);

        if (contact != null) {
            System.out.println("Contact name: " + contact.getContactName() + ", phone number: " + contact.getContactPhoneNumber());
        } else {
            System.out.println("The contact name you entered hasn't been found.");
        }
    }

    public static void printContacts() {
        mobilePhone.printContacts();
    }
}

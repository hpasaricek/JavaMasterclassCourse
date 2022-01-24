import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("09150152950");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Shutting down.");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added. Name - " + name + ", phone - " + phone);
        } else {
            System.out.println("Can't add the contact.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Enter new contact name:");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number:");
            String newNumber = scanner.nextLine();
            Contact contact = Contact.createContact(newName, newNumber);
            mobilePhone.updateContact(existingContact, contact);
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            mobilePhone.removeContact(existingContact);
        }
    }

    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Name: " + existingContact.getName() + ", number: " + existingContact.getPhoneNumber());
        }
    }


    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown.");
        System.out.println("1 - to print contacts.");
        System.out.println("2 - to add a new contact.");
        System.out.println("3 - to update an existing contact.");
        System.out.println("4 - to remove an existing contact.");
        System.out.println("5 - query if an existing contact exists");
        System.out.println("6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactList = new ArrayList<>();

    public void displayPhoneOptions() {
        System.out.println("--------------------------");
        System.out.println("Mobile phone options:");
        System.out.println("\r1. Add new contact.");
        System.out.println("\r2. Update existing contact.");
        System.out.println("\r3. Remove contact.");
        System.out.println("\r4. Print list of contacts.");
        System.out.println("\r5. Find contact.");
        System.out.println("\r6. Quit.");
        System.out.println("--------------------------");
        System.out.println("Enter your option:");

    }

    public void addNewContact(String contactName, int contactNumber) {
        Contacts contact = getContact(contactName);

        if (contact == null) {
            contactList.add(new Contacts(contactName, contactNumber));
            System.out.println("Added new contact to the list.");
        } else {
            System.out.println("There is already a contact with this name in the list.");
        }
    }

    public void updateContact(String oldContactName, String newContactName, int newContactNumber) {
        Contacts contact = getContact(oldContactName);

        if (contact != null) {
            contact.setContactName(newContactName);
            contact.setContactPhoneNumber(newContactNumber);
            System.out.println("Changed contact information.");
        }
    }

    public void removeContact(String contactName) {
        Contacts contact = getContact(contactName);

        if (contact != null) {
            contactList.remove(contact);
            System.out.println("Contact removed.");
        }
    }

    public void printContacts() {
        System.out.println("Contact name - Contact number");
        for (Contacts contacts : contactList) {
            System.out.println(contacts.getContactName() + " " + contacts.getContactPhoneNumber());
        }
    }

    public void findContact(String contactName) {
        Contacts contact = getContact(contactName);

        if (contact != null) {
            System.out.println("Found the following contact:");
            System.out.println(contact.getContactName() + " - " + contact.getContactPhoneNumber());
        }
    }

    private Contacts getContact(String contactName) {
        for (Contacts contact : contactList) {
            if (contact.getContactName().equals(contactName)) {
                return contact;
            }
        }
        System.out.println("Contact doesn't exist.");
        return null;
    }
}

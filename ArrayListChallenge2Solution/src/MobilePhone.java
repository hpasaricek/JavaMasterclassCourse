import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public boolean addNewContact(Contact contact) {
        if (contactIndex(contact) >= 0) {
            return false;
        }
        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactIndex = contactIndex(oldContact);
        if (contactIndex < 0) {
            return false;
        } else if (contactIndex(newContact) >= 0) {
            System.out.println("Contact with that name already exists.");
            return false;
        }
        contacts.set(contactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int contactIndex = contactIndex(contact);
        if (contactIndex < 0) {
            return false;
        }
        contacts.remove(contact);
        return true;
    }

    public Contact queryContact(String contactName) {
        int contactIndex = contactIndex(contactName);
        if (contactIndex < 0) {
            return null;
        }
        return contacts.get(contactIndex);
    }

    public void printContacts() {
        System.out.println("Contact Name\tContact Number");
        for (Contact contact : contacts) {
            System.out.println(contact.getContactName() + "\t" + contact.getContactPhoneNumber());
        }
    }

    public void displayOptions() {
        System.out.println("1. Add new contact.");
        System.out.println("2. Update existing contact.");
        System.out.println("3. Remove contact.");
        System.out.println("4. Query contact.");
        System.out.println("5. Print contact list.");
        System.out.println("6. Quit.");
    }

    private int contactIndex(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            String name = contacts.get(i).getContactName();
            if (name.equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    private int contactIndex(Contact contact) {
        return this.contactIndex(contact.getContactName());
    }
}


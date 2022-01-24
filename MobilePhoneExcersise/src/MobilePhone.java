import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            return false;
        }

        myContacts.set(findContact(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) < 0) {
            return false;
        }

        myContacts.remove(contact);
        return true;
    }

    public Contact queryContact(String contactName) {
        return findContact(contactName) < 0 ? null : myContacts.get(findContact(contactName));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) +". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (contactName.equals(myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
}

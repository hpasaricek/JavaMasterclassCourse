public class Contacts {
    private String contactName;
    private int contactPhoneNumber;

    public Contacts(String contactName, int contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public int getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(int contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
}

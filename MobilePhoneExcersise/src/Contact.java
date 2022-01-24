public class Contact implements Comparable<Contact>{
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public int compareTo(Contact o) {
        return name.compareTo(o.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 50;
    }

    @Override
    public boolean equals(Object obj) {
        return name.equals( ((Contact)obj).name);
    }


}

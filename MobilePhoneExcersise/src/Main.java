public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("0915015295");

        Contact hrvoje = new Contact("Hrvoje","12515");
        Contact maja = new Contact("Maja","12515");
        Contact ivan = new Contact("Ivan","12515");
        Contact zora = new Contact("Zora","12515");
        Contact marko = new Contact("Marko","12515");

        System.out.println(mobilePhone.addNewContact(new Contact("Hrvoje","615163131")));
        System.out.println(mobilePhone.addNewContact(new Contact("Hrvoje","521515")));



    }
}

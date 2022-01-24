public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(123456789);
        timsPhone.powerOn();
        timsPhone.callPhone(123456789);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        decryptedPassword = password;
    }

   /* @Override
    public void storePassword() {
        System.out.println("Saving password as " + decryptedPassword);
    }*/
}

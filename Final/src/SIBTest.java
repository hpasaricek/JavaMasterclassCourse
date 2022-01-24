public class SIBTest {
    public static final String owner;

    static {
        owner = "Tim";
        System.out.println("SIBTest static initilaziataon block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor called");
    }

    static {
        System.out.println("Second SIBTest static initiliaziaton block called.");
    }

    public void someMethod() {
        System.out.println("someMethod() called.");
    }
}

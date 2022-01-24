import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @BeforeAll
    public static void beforeA() {
        System.out.println("Before All!");
    }

    @BeforeEach
    public void setup() {
        account = new BankAccount("Hrvoje Pasaricek",1000.00);
        System.out.println("Starting test!");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(1200, balance);
    }

    @Test
    public void deposit_branch() {
       Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
           account.deposit(800, false);
       });
  
    }

    @AfterEach
    public void close() {
        System.out.println("Ending test!");
    }

}
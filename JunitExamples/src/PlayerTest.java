import static org.junit.Assert.*;

public class PlayerTest {
    Player frenki = new Player("Frenki", 14);

    @org.junit.Test
    public void isMinor() {
        assertTrue(frenki.isMinor());
    }

    @org.junit.Test
    public void getCodeName() {
        assertEquals("Frenki_14", frenki.getCodeName());
    }
}
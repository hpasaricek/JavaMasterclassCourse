import java.util.ArrayList;
import java.util.List;

public class Main<T extends Number> {
    List<T> list = new ArrayList<>();

    public static void main(String[] args) {
        displayNumber(20);
        displayNumber("Hrvoje");
    }

    private void addToList(T var) {

    }

    private static <T extends Number> void displayNumber(T var) {
        System.out.println(var);
    }
}






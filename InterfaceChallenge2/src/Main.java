import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> savedValues = new ArrayList<>();

    public static void main(String[] args) {
        Player hrvoje = new Player("Hrvoje");
        System.out.println(hrvoje);

        hrvoje.takeDamage(30);
        System.out.println(hrvoje);

        save(hrvoje);
        System.out.println(hrvoje);

        load(hrvoje);
        System.out.println(hrvoje);

        hrvoje.takeDamage(40);
        System.out.println(hrvoje);

        load(hrvoje);
        System.out.println(hrvoje);
    }

    private static void save(Saveable objectToSave) {
        savedValues = objectToSave.saveValues();
        System.out.println("Saved values.");
    }

    private static void load(Saveable objectToLoad) {
        objectToLoad.loadValues(savedValues);
        System.out.println("Loaded values.");
    }
}

import java.util.ArrayList;

public interface Saveable {
    ArrayList<Integer> saveValues();
    void loadValues(ArrayList<Integer> values);
}

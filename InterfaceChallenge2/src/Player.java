import java.util.ArrayList;

public class Player implements Saveable {
    private String playerName;
    private int playerHealth = 100;
    private int playerMana = 20;
    private int playerExperience = 0;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void takeDamage(int damagePoints) {
        playerHealth -= damagePoints;
        System.out.println(playerName + " took " + damagePoints + " damage points.");
    }

    @Override
    public ArrayList<Integer> saveValues() {
        ArrayList<Integer> playerValues = new ArrayList<>();
        playerValues.add(playerHealth);
        playerValues.add(playerMana);
        playerValues.add(playerExperience);
        return playerValues;
    }

    @Override
    public void loadValues(ArrayList<Integer> values) {
        playerHealth = values.get(0);
        playerMana = values.get(1);
        playerExperience = values.get(2);
    }

    @Override
    public String toString() {
        return "=================================\n" +
                "Player name: " + playerName + "\nHealth: " + playerHealth + "\nMana: " + playerMana + "\nExperience: " + playerExperience +
                "\n=================================";
    }
}

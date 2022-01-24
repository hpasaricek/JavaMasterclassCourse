import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable {
    private String playerName;
    private int playerHealth = 100;
    private int playerMana = 20;
    private int playerExperience = 0;
    private List<Integer> playerValues = new ArrayList<>();

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public void attackMonster(Monster monster, int attackPoints) {
        System.out.println(playerName + " attacked with " + attackPoints + " attack points.");
        monster.takeDamage(attackPoints);
        if (monster.isDead()) {
            playerExperience += monster.getExpPoints();
        }
    }

    @Override
    public void saveValues() {
        playerValues.add(0, playerHealth);
        playerValues.add(1, playerMana);
        playerValues.add(2, playerExperience);
        System.out.println("Saved the current player values.");
    }

    @Override
    public void loadValues() {
        if (playerValues.isEmpty()) {
            playerHealth = 100;
            playerMana = 20;
            playerExperience = 0;
            System.out.println("No saved values present. Loading default values.");
            return;
        } else {
            playerHealth = playerValues.get(0);
            playerMana = playerValues.get(1);
            playerExperience = playerValues.get(2);
            System.out.println("Loaded player values from a saved file.");
        }
    }

    @Override
    public String toString() {
        return "=================================\n" +
                "Player name: " + playerName + "\nHealth: " + playerHealth + "\nMana: " + playerMana + "\nExperience: " + playerExperience +
                "\n=================================";
    }
}

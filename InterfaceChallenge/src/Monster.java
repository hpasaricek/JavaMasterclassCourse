

public class Monster {
    private String monsterName;
    private int monsterHealth = 50;
    private int monsterMana = 10;
    private boolean isDead = false;
    private int expPoints = 20;

    public Monster(String monsterName) {
        this.monsterName = monsterName;
    }

    public void takeDamage(int damagePoints) {
        System.out.println(monsterName + " took " + damagePoints + " damage points.");
        monsterHealth -= damagePoints;
        if (monsterHealth <= 0) {
            System.out.println("The monster died. Awarded 20 experience points.");
            isDead = true;
        }
    }

    public boolean isDead() {
        return isDead;
    }

    public int getExpPoints() {
        return expPoints;
    }
}

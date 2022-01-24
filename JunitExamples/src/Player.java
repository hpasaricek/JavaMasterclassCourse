public class Player {
    private String playerName;
    private int playerAge;

    public Player(String playerName, int playerAge) {
        this.playerName = playerName;
        this.playerAge = playerAge;
    }

    public boolean isMinor() {
        return playerAge < 18;
    }

    public String getCodeName() {
        return playerName + "_" + playerAge;
    }
}

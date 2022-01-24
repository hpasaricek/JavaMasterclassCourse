public class GamingRoom {
    private TV tv;
    private GamingConsole gameConsole;
    private Sofa sofa;
    private int numberOfWindows;
    private int floor;

    public GamingRoom(TV tv, GamingConsole gameConsole, Sofa sofa, int numberOfWindows, int floor) {
        this.tv = tv;
        this.gameConsole = gameConsole;
        this.sofa = sofa;
    }

    public TV getTv() {
        return tv;
    }

    public GamingConsole getGameConsole() {
        return gameConsole;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void turnOnTV() {
        tv.pressPowerButton();
        System.out.println("The TV is now turned on.");
    }

    public void playGame() {
        gameConsole.insertGameDisc();
        System.out.println("The game is booting and you are about to play.");
    }

    public void sitDown() {
        sofa.extendSofa();
        System.out.println("You are now comfortable and ready to enjoy.");
    }
}

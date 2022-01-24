public class Main {
    public static void main(String[] args) {

        calculateScore("Hrvoje", 500);
        calculateScore(500);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score.");
        return -1;
    }

}

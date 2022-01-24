public class Main {
    public static void main(String[] args) {
        Player hrvoje = new Player("Hrvoje");
        System.out.println(hrvoje.toString());

        Monster monster = new Monster("Goblin");

        hrvoje.attackMonster(monster,30);
        System.out.println(hrvoje.toString());

        hrvoje.attackMonster(monster,30);
        System.out.println(hrvoje.toString());

        hrvoje.saveValues();
        hrvoje.loadValues();
        System.out.println(hrvoje.toString());

    }
}

public class Main {
    public static void main(String[] args) {
        TV samsungTV = new TV("Samsung","NU7042",40,"Full HD");
        GamingConsole playStation5 = new GamingConsole("Sony","PlayStation 5",825,"White and Black");
        Sofa singleSofa = new Sofa("Ikea","Beige",1);

        GamingRoom hrvojesRoom= new GamingRoom(samsungTV,playStation5,singleSofa,1,4);

        hrvojesRoom.getTv().pressPowerButton();
        hrvojesRoom.getGameConsole().insertGameDisc();
        hrvojesRoom.getSofa().extendSofa();

        System.out.println("------------------------------");

        hrvojesRoom.turnOnTV();
        hrvojesRoom.playGame();
        hrvojesRoom.sitDown();
    }
}

public class Main {
    public static void main(String[] args) {
        StockList hrvojeList = new StockList("Hrvoje List");
        Basket hrvojeBasket = new Basket("Hrvoje Basket");
        StockItem temp;

        temp = new StockItem("Bread",7);
        hrvojeList.addItemToStock(temp,2);
        hrvojeList.addItemToStock(temp,10);



        System.out.println(hrvojeList);

    }
}

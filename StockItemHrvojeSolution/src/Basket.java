import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {
    private String basketName;
    private Map<StockItem, Integer> basket = new LinkedHashMap<>();

    public Basket(String basketName) {
        this.basketName = basketName;
    }

    public void addToBasket(StockItem item, int quantity) {
        if (itemExists(item)) {
            int newQuantity = basket.get(item) + quantity;
            basket.replace(item, newQuantity);
        }

        basket.put(item, quantity);
        System.out.println("Added " + item.getItemName() + " " + quantity + " to basket");
    }

    public void removeFromBasket(StockItem item) {
        if (!itemExists(item)) {
            System.out.println("Basket.removeFromBasket() - Error!");
            return;
        }

        basket.remove(item);
        System.out.println("Removed " + item.getItemName() + " from basket.");
    }

    public void changeQuantity(StockItem item, int quantity) {
        if (!itemExists(item)) {
            System.out.println("Basket.changeQuantity() - Error!");
            return;
        }

        int newQuantity = basket.get(item) + quantity;
        basket.replace(item,newQuantity);
        System.out.println("Removed " + quantity + " from " + item.getItemName());
    }

    private boolean itemExists(StockItem item) {
        return basket.containsKey(item);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Contents of " + this.basketName + ": ");
        s.append("==================================================================");
        for (Map.Entry<StockItem, Integer> items : basket.entrySet()) {
            s.append(items.getKey().getItemName()).append(" - ").append(items.getValue());
        }
        s.append("==================================================================");
        return s.toString();
    }
}

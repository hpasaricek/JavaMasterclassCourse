import java.util.HashMap;
import java.util.Map;

public class StockList {
    private String listName;
    private Map<String, StockItem> stockList = new HashMap<>();

    public StockList(String listName) {
        this.listName = listName;
    }

    public void addItemToStock(StockItem item, int quantity) {
        if (isInvalidEntry(item, quantity)) {
            System.out.println("StockList.addItemToStock() - Error!");
            return;
        }

        if (itemExists(item.getItemName())) {
            stockList.get(item.getItemName()).addItemQuantity(quantity);
        } else {
            stockList.put(item.getItemName(), item);
            stockList.get(item.getItemName()).addItemQuantity(quantity);
            System.out.println("Added new item " + item.getItemName() + " to list.");
        }
    }

    public void removeItemFromStock(String itemName) {
        if (!itemExists(itemName)) {
            System.out.println("StockList.removeItemFromStock() - Error!");
            return;
        }

        stockList.remove(itemName);
        System.out.println("Removed " + itemName + " from " + listName + " stocklist.");
    }

    public void sellItemQuantity(String itemName, int quantity) {
        if (!itemExists(itemName)) {
            System.out.println("StockList.sellItemQuantity() - Error!");
            return;
        }

        stockList.get(itemName).removeItemQuantity(quantity);
    }

    private boolean itemExists(String itemName) {
        return this.stockList.containsKey(itemName);
    }

    private boolean isInvalidEntry(StockItem item, int quantity) {
        return (item == null) || (quantity < 0);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("Stocklist " + this.listName + " contains:\n");
        s.append("========================================================\n");
        for (Map.Entry<String, StockItem> items : stockList.entrySet()) {
            s.append(items.getValue().getItemName()).append(" - ").append(items.getValue().getItemPrice()).append("$ - ").append(items.getValue().getItemQuantity()).append(" PCS\n");
        }
        s.append("========================================================");
        return s.toString();
    }
}

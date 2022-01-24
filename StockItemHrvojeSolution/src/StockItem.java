public class StockItem {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public StockItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public void addItemQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("StockItem.addItemQuantity() - Error!");
            return;
        }

        this.itemQuantity += quantity;
        System.out.println("Quantity added: " + quantity + " to item: " + this.itemName);
    }

    public void removeItemQuantity(int quantity) {
        if (quantity > this.itemQuantity) {
            System.out.println("StockItem.removeItemQuantity() - Error!");
            return;
        }

        this.itemQuantity -= quantity;
        System.out.println("Removed " + quantity + " from item " + this.itemName);
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    @Override
    public boolean equals(Object item) {
        if (this == item) {
            return true;
        }

        if ((item == null) || !(this.getClass() == item.getClass())) {
            return false;
        }

        return this.itemName.equals(((StockItem)item).itemName);
    }

    @Override
    public int hashCode() {
        return this.itemName.hashCode() + 51;
    }
}

public class ItemInfoNode {
    private ItemInfoNode previous;
    private ItemInfoNode next;
    private ItemInfo itemInfo;

    public ItemInfoNode(ItemInfo itemInfo, ItemInfoNode next, ItemInfoNode previous) {
        this.itemInfo = itemInfo;
        this.next = next;
        this.previous = previous;
    }

    public ItemInfoNode getPrevious() {
        return previous;
    }

    public void setPrevious(ItemInfoNode previous) {
        this.previous = previous;
    }

    public ItemInfoNode getNext() {
        return next;
    }

    public void setNext(ItemInfoNode next) {
        this.next = next;
    }

    public ItemInfo getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }
}

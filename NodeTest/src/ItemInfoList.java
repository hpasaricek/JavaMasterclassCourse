public class ItemInfoList {
    private ItemInfoNode head;
    private ItemInfoNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void addFront(ItemInfo itemInfo) {
        size++;
        if (head == null) {
            head = new ItemInfoNode(itemInfo, null, null);
            tail = head;
        } else {
            ItemInfoNode node = new ItemInfoNode(itemInfo, head, null);
            head.setPrevious(node);
            head = node;
        }
    }

    public void addBack(ItemInfo itemInfo) {
        size++;
        if (head == null) {
            head = new ItemInfoNode(itemInfo, null, null);
            tail = head;
        } else {
            ItemInfoNode node = new ItemInfoNode(itemInfo, null, tail);
            tail.setNext(node);
            tail = node;
        }
    }

    public ItemInfo removeFront() {
        ItemInfo itemInfo = null;
        if (head != null) {
            size--;
            itemInfo = head.getItemInfo();
            if (head.getNext() != null) {
                head.getNext().setPrevious(null);
                head = head.getNext();
            } else {
                head = null;
                tail = null;
            }
        }
        return itemInfo;
    }

    public ItemInfo removeBack() {
        ItemInfo itemInfo = null;
        if (head != null) {
            size--;
            itemInfo = tail.getItemInfo();
            if (tail.getPrevious() != null) {
                tail.getPrevious().setNext(null);
                tail = tail.getPrevious();
            } else {
                head = null;
                tail = null;
            }
        }
        return itemInfo;
    }
}

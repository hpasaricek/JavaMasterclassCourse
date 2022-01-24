import java.util.ArrayList;
import java.util.List;

public class StringList {
    private StringListNode head;
    private StringListNode tail;
    private int size;
    private List<StringListNode> nodes = new ArrayList<>();

    public int getSize() {
        return size;
    }

    public void addString(String newString) {
        if (stringExists(newString)) {
            return;
        }

        if (head == null) {
            size++;
            head = new StringListNode(newString, null, null);
            tail = head;
        } else {
            size++;
            StringListNode currentNode = head;
            StringListNode newNode = new StringListNode(newString, null, null);
            while (currentNode.getNext() != null) {
                if (currentNode.getString().compareTo(newNode.getString()) > 0) {
                    newNode.setPrevious(currentNode.getPrevious());
                    newNode.setNext(currentNode);
                    currentNode.setPrevious(newNode);
                }
            }
        }

    }

    private boolean stringExists(String newString) {
        for (StringListNode node : nodes) {
            if (node.getString().equals(newString)) {
                System.out.println(newString + " already exists in this list.");
                return true;
            }
        }
        return false;
    }


}

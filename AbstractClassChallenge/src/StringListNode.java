public class StringListNode {
    private String string;
    private StringListNode previous;
    private StringListNode next;

    public StringListNode(String string, StringListNode previous, StringListNode next) {
        this.string = string;
        this.previous = previous;
        this.next = next;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public StringListNode getPrevious() {
        return previous;
    }

    public void setPrevious(StringListNode previous) {
        this.previous = previous;
    }

    public StringListNode getNext() {
        return next;
    }

    public void setNext(StringListNode next) {
        this.next = next;
    }
}

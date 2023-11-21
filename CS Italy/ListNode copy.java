public class ListNode {
    private Object element;
    private ListNode next;

    public ListNode(Object obj, ListNode node) {
        element = obj; 
        next = node;
    }

    public ListNode() { this(null,null); }

    public ListNode getNext() {
        return next;
    }
    public Object getElement() {
        return element;
    }

    public void setElement(Object obj) {
        element = obj;
    }

    public void setNext(ListNode n) {
        next = n;
    }
}
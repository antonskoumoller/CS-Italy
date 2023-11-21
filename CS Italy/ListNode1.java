public class ListNode1 {
    private Object element;
    private ListNode1 next; 

    public ListNode1(Object e, ListNode1 n) {
        element = e;
        next = n; 
    }
    public ListNode1() { this(null,null); }
    
    public void setElement(Object e) {
        element = e;
    }

    public void setNext(ListNode1 n) {
        next = n;
    }

    public ListNode1 getNext() {
        return next;
    }

    public Object getElement() {
        return element;
    }
}
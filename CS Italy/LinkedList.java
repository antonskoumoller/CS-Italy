public class LinkedList implements Container {
    private ListNode head, tail;

    public LinkedList() {
        makeEmpty();
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public void makeEmpty() {
        head = tail = new ListNode();
    }

    @Override
    public int size() {
        return -1;
    }

    public Object getFirst() {
        return head.getNext().getElement();
    }

    public Object getLast() {
        return tail.getElement();
    }

    public void addFirst(Object obj) {
        ListNode temp = new ListNode();
        temp.setNext(head);
        head.setElement(obj); 
        head = temp;
    }

    public void addLast(Object obj) {
        ListNode temp = new ListNode();
        temp.setElement(obj);
        tail.setNext(temp);
        tail = temp;
    }

    public Object removeFirst() {
        Object removed = head.getNext().getElement();
        head = head.getNext();
        head.setElement(null);
        return removed; 
    }

    public Object removeLast() {
        Object removed = tail.getElement();
        ListNode temp = head;
        while (temp.getNext() != tail) { temp = temp.getNext(); }
        tail = temp;
        tail.setNext(null);
        return removed;
    }
    
}
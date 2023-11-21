public class LinkedList1 implements Container1 {
    private ListNode1 head; 
    private ListNode1 tail;
    int size;

    public boolean isEmpty() {
        return size() == 0;
        
    }

    public void makeEmpty() { 
        head = tail = new ListNode1();
        size = 0;

    }
    public int size() { return size; }

    public Object getFirst() {
        return head.getNext().getElement();
    }

    public Object getLast() {
        return tail.getElement();

    }

    public void addFirst(Object e) {
        ListNode1 temp = new ListNode1(e,head);
        head = temp; 
    }
    
    public void addLast(Object e) {
        ListNode1 temp = new ListNode1();
        temp.setElement(e);
        tail = temp;
    } 

    public Object removeFirst() {
        Object removed = head.getNext().getElement();
        ListNode1 temp = head.getNext();
        head = temp;
        head.setElement(null);
        return removed;
    }

    public Object removeLast() {
        Object removed = tail.getElement();
        ListNode1 temp = head;
        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }
        tail = temp; 
        return removed;
    }
    
}
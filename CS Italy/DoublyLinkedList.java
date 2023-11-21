public class DoublyLinkedList<E> implements Container {
    DoublyListNode head, tail;
    int size;

    public DoublyLinkedList() {
        makeEmpty();
    }

    public boolean isEmpty() {return head == tail; }
    
    public void makeEmpty() {
        head = tail = new DoublyListNode();
        size = 0;        
    }

    @Override
    public int size() {
        return size;
    } 

    public void addFirst(E e) {
        DoublyListNode temp = new DoublyListNode();
        head.setElement(e);
        temp.setNext(head);
        head.setPrevious(temp);
        head = temp;
        size++;
    }

    public void addLast(E e) {
        DoublyListNode temp = new DoublyListNode();
        temp.setElement(e);
        tail.setNext(temp);
        temp.setPrevious(tail);
        tail = temp;
        size++;
    } 

    public E removeFirst() {
        head = head.getNext(); 
        Object removed = head.getElement();
        head.setElement(null);
        size--;
        return (E)removed;
    }

    public E removeLast() {
        Object removed = tail.getElement();
        tail = tail.getPrevious();
        tail.setNext(null);
        size--;
        return (E)removed;
    }

    public E getFirst() {
        return (E)head.getNext().getElement();
    }

    public E getLast() {
        return (E)tail.getElement();
    }
}
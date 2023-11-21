public class DoublyListNode<E> {
    private DoublyListNode next;
    private DoublyListNode previous;
    private E element;

    public DoublyListNode(E e, DoublyListNode n, DoublyListNode p) {
        next = n;
        previous = p;
        element = e; 
    }

    public DoublyListNode() { this(null, null, null); }

    public E getElement() { return (E)element; }

    public DoublyListNode getNext() { return next; }

    public DoublyListNode getPrevious() { return previous; }

    public void setNext(DoublyListNode ln) { next = ln; }
    
    public void setPrevious(DoublyListNode ln) { previous = ln; }

    public void setElement(E e) { element = e; }


}
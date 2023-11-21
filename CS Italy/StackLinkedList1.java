public class StackLinkedList1 extends LinkedList1 implements Stack1 {

    private LinkedList1 stack;
    private int size;

    public StackLinkedList1() {
        makeEmpty();
    }

    public void push(Object obj) {
    stack.addFirst(obj);
    }
    
    public Object pop() {
        Object removed = stack.removeFirst();
        return removed;
    }
    
    public Object top() {
        return stack.getFirst();
    }


}
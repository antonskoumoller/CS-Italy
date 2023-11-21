public class StackLinkedList implements Stack {
    private LinkedList stack;
    int size;

    public StackLinkedList() {
        makeEmpty();
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void makeEmpty() {
        stack = new LinkedList();
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(Object obj) {
        stack.addFirst(obj);
        
    }

    @Override
    public Object pop() {
        Object popped = stack.getFirst();
        stack.removeFirst();
        return popped;
    }

    @Override
    public Object top() {
        return stack.getFirst();
    }

}
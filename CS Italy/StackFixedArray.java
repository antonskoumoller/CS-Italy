public class StackFixedArray implements Stack {
    private final int CAP = 10;
    Object[] v;
    private int vSize;

    public StackFixedArray(){
        makeEmpty();
    }

    @Override
    public boolean isEmpty() {
        return vSize == 0;
    }

    @Override
    public void makeEmpty() {
        v = new Object[CAP];
        vSize = 0;
    }

    @Override
    public int size() {
        return vSize;
    }

    @Override
    public void push(Object obj) throws FullStackException {
        if (vSize >= v.length)
            throw new FullStackException();
        v[vSize++] = obj;
    }


    @Override
    public Object pop() throws EmptyStackException{
        if (vSize <= 0)
            throw new EmptyStackException();
        vSize--;
        Object popped = v[vSize];
        v[vSize] = null;
        return popped;
    }

    @Override
    public Object top() {
        
        return v[vSize-1];
    }
}
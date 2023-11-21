public class QueueFixedArray implements Queue {
    private final int CAP = 10;
    Object[] queue;
    int back, front;

    public QueueFixedArray() {
        makeEmpty();
    }

    @Override
    public boolean isEmpty() {
        return (back == front);
    }

    @Override
    public void makeEmpty() {
        queue = new Object[CAP];
    }

    @Override
    public int size() {
        return back-front;
    }

    @Override
    public void enqueue(Object obj) throws FullQueueException {
        if (back == queue.length)
            throw new FullQueueException();
        queue[back++] = obj;
    }

    @Override
    public Object dequeue() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();

        Object dequeued = queue[front];
        queue[front++] = null;
        return dequeued;
    }

    @Override
    public Object front() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();
        return queue[front];
    }

}
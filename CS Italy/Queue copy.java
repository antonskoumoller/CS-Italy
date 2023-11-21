public interface Queue extends Container {
    void enqueue(Object obj) throws FullQueueException;
    Object dequeue() throws EmptyQueueException;
    Object front() throws EmptyQueueException;
    
}
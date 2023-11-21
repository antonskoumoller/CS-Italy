public class QueueCircularArray extends QueueFixedArray {

    @Override
    public void enqueue(Object obj) throws FullQueueException {
        if (back+1 >= queue.length) {
            
        }

        super.enqueue(obj);
    }


}
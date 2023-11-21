public class QueueGrowingArray extends QueueFixedArray {

    @Override
    public void enqueue(Object obj) throws FullQueueException {
        if (back >= queue.length) {
            resize();
        }
        super.enqueue(obj);
    }

    private void resize() {
        Object[] newQueue = new Object[queue.length * 2];
        System.arraycopy(queue, front, newQueue, 0, size());
        queue = newQueue;
    }


}
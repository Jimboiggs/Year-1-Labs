public class ConcurrentCyclicQueue extends CyclicQueue {
    public ConcurrentCyclicQueue(int capacity) {
        super(capacity);
    }

    @Override
    public synchronized void enqueue(int number) {
        while (isFull()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
        super.enqueue(number);
    }

    @Override
    public synchronized int dequeue() {
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
        return super.dequeue();
    }
}

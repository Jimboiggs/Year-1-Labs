public class Consumer extends QueueWorker {
    public Consumer(NumberQueue queue) {
        super(queue);
    }

    @Override
    public int action() {
        return queue.dequeue();
    }
}

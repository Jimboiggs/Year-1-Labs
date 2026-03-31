public class CyclicQueue implements NumberQueue {
    private int[] data;
    private int head;
    private int tail;
    private int capacity;

    public CyclicQueue(int capacity) {
        this.capacity = capacity + 1;
        this.data = new int[this.capacity];
        this.head = 0;
        this.tail = 0;
    }

    @Override
    public void enqueue(int number) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        } else {
            data[head] = number;
            head = (head + 1) % data.length;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int oldTail = tail;
        tail = (tail + 1) % data.length;
        return data[oldTail];
    }

    @Override
    public boolean isFull()
    {
        return (head + 1) % data.length == tail;
    }

    @Override
    public boolean isEmpty()
    {
        return (head == tail);
    }
}
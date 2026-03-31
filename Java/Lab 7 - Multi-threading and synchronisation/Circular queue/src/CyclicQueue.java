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
}
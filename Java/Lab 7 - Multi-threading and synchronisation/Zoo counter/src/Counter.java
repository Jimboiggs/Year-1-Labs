public class Counter {
    private int count = 0;

    public synchronized void addOne() {
        count += 1;
    }

    public int getCount() {
        return count;
    }
}
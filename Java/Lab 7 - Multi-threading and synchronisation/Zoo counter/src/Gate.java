public class Gate implements Runnable {
    private Counter counter;
    private int guestNum;

    public Gate(Counter counter, int guestNum) {
        this.counter = counter;
        this.guestNum = guestNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < guestNum; i++) {
            counter.addOne();
        }
    }
}

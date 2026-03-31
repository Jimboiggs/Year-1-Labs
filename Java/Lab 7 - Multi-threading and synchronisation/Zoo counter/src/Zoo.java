public class Zoo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Gate gate1 = new Gate(counter, 5000);
        Gate gate2 = new Gate(counter, 5000);

        Thread[] threads = new Thread[2];
        Thread thread1 = new Thread(gate1);
        Thread thread2 = new Thread(gate2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        int expected = 5000 + 5000;

        System.out.println("Expected guests: " + expected);
        System.out.println("Actual count: " + counter.getCount());
    }
}
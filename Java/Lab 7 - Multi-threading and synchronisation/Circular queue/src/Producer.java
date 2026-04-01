import java.util.Random;

public class Producer extends QueueWorker {
    private Random rand = new Random();

    public Producer(NumberQueue queue) {
        super(queue);
    }

    @Override
    public int action() {
        int number = rand.nextInt(10) + 1;
        queue.enqueue(number);
        return number;
    }
}

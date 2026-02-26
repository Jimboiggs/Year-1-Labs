public class Parrot extends Omnivore {
    public Parrot(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void makeNoise() {
        System.out.println("Parrot noise");
    }

    public Parrot(Integer age) {
        this("Polly", age);
    }
}

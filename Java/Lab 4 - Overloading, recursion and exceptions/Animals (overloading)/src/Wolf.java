public class Wolf extends Carnivore {
    public Wolf(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void makeNoise() {
        System.out.println("Wolf noise");
    }

    public Wolf() {
        super();
    }
}

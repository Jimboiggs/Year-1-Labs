public abstract class Carnivore extends Animal {
    public Carnivore(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void eat(Food food) {
        if (food instanceof Plant) {
            throw new RuntimeException (" Carnivore can only eat Meat.");
        } else {
            System.out.println("Eating " + food.getName());
        }
    }

    public Carnivore() {
        super();
    }
}

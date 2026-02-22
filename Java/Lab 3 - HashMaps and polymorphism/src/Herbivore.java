public abstract class Herbivore extends Animal {
    public Herbivore(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new RuntimeException ("Herbivore can only eat Plants.");
        } else {
            System.out.println("Eating " + food.getName());
        }

    }
}

public abstract class Omnivore extends Animal {
    public Omnivore(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void eat(Food food) {
        System.out.println("Eating " + food.getName());
    }
}

public abstract class Herbivore extends Animal {
    public Herbivore(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void eat(Food food) {
        System.out.println("Eating " + food.getName());
    }
}

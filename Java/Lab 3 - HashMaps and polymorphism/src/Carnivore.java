public abstract class Carnivore extends Animal {
    public Carnivore(String newName, Integer newAge) {
        super(newName, newAge);
    }

    public void eat(Food food) {
        System.out.println("Eating " + food.getName());
    }
}

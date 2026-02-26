public abstract class Animal implements Comparable<Animal>{
    private String name;
    private Integer age;

    public Animal(String newName, Integer newAge) {
        name = newName;
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public abstract void makeNoise();

    public abstract void eat(Food food);

    public void eat(Food food, Integer n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.println("Eating: " + food.getName());
        }
    }

    public Animal() {
        this("newborn", 0);
    }

    @Override
    public int compareTo(Animal other) {
        return this.age - other.age;
    }
}

public class Animal {
    private String name;
    private Integer age;

    public Animal(String newName, Integer newAge) {
        name = newName;
        age = newAge;
    }

    public void makeNoise() {
        System.out.println("Animal noise");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

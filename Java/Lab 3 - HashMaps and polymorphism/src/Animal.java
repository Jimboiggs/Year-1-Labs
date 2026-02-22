public class Parrot {
    private String name;
    private Integer age;

    public Parrot(String newName, Integer newAge) {
        name = newName;
        age = newAge;
    }

    public void makeNoise() {
        System.out.println("Parrot noise");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

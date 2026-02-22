public class Wolf {
    private String name;
    private Integer age;

    public Wolf(String newName, Integer newAge) {
        name = newName;
        age = newAge;
    }

    public void makeNoise() {
        System.out.println("Wolf noise");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}

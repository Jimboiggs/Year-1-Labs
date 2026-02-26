public class Main {
    public static void main(String[] args) {
        Wolf exampleWolf = new Wolf("Wolf", 20);
        Parrot exampleParrot = new Parrot("Parrot", 18);
        exampleWolf.getAge();
        exampleParrot.getAge();
        exampleWolf.getName();
        exampleParrot.getName();

        Meat chicken = new Meat("Chicken");
        Plant spinach = new Plant("Spinach");

        exampleWolf.makeNoise();
        exampleParrot.makeNoise();

        RedPanda examplePanda = new RedPanda("Poe", 20);
        examplePanda.makeNoise();
        examplePanda.eat(spinach);

        exampleWolf.eat(chicken, 5);
    }
}
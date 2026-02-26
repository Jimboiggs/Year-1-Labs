import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Wolf("Adam", 20));
        animals.add(new Parrot("Alex", 7));
        animals.add(new RedPanda("Gabriel", 30));

        // Demonstrates Comparable<T>
        System.out.println(animals);
        Collections.sort(animals);
        System.out.println(animals);
    }
}

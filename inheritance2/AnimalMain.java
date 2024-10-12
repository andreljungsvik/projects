import java.util.*;

public class AnimalMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Arthropod("bee", new String[] {"egg", "larvae", "pupa", "imago"}));
        animals.add(new Arthropod("Krill", new String[] {"egg", "nauplius", "adult"}));
        animals.add(new Chordate("Human", 0));
        animals.add(new Chordate("Glass Frog", 4));

        for(Animal animal : animals) {
            System.out.println(animal.getName());
        }
    } 
}

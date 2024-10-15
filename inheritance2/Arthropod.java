import java.util.*;

public class Arthropod extends Animal {
    private String[] lifeStages;

    public Arthropod(String name, String[] lifeStages) {
        super(name);
        this.lifeStages = Arrays.copyOf(lifeStages, lifeStages.length);
    }

    public String[] getLifeStages() {
        return Arrays.copyOf(lifeStages, lifeStages.length);
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "Life stages: " + Arrays.toString(lifeStages) + "\n"; 
    }
}
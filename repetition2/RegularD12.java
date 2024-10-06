import java.util.*;

public class RegularD12 implements GameDie{
    @Override
    public int roll() {
        Random rand = new Random();
        int roll = rand.nextInt(12) + 1;
        return roll;
    }

    public String getDescription() {
        return "En tolvsidig tärning";
    }
}

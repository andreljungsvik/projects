import java.util.*;

public class RegularD6 implements GameDie{
    @Override
    public int roll() {
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        return roll;
    }

    public String getDescription() {
        return "En sexsidig tärning";
    }
}

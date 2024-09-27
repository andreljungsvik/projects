import java.util.*;

/**
 * Tärningspel, antal slag bestämms av användaren.
 */
public class GameDie {
    private int sides;
    private int rollSum;
    private int rollCount;
    private int maxRoll;
    private int roll;
    private String name;

    /**
     * Standard sidor är 6
     */
    public GameDie() {
        sides = 6;
    }

    /**
     * Låter användaren välja hur många sidor
     * om inget anges sätter till 6 sidor
     * @param sides antal sidor på tärning
     */
    public GameDie(int sides) {
        if (sides % 2 == 0 && sides <= 20 && sides >= 4) {
            this.sides = sides;
        } else {
            System.out.println(
                    "Antal sidor måste vara ett jämnt antal mellan 4 och 20. Standardvärdet av 6 har applicerats.");
            this.sides = 6;
        }
        this.name = "För den " + sides;
    }

    /**
     * Slår tärningen angivet antal gånger
     * @param rollAmount hur många slag användaren vill slå
     */
    public void rollDice(int rollAmount) {
        Random random = new Random();
        for (; rollAmount >= maxRoll;) {
            roll = random.nextInt(sides) + 1;
            rollSum += roll;
            rollCount++;
            if (maxRoll < roll) {
                maxRoll = roll;
            }
            if (roll == sides) {
                System.out.print(name);
                getStats();
                break;
            }
        }
    }

    /**
     * räknar ut medelvärdet för antal slag.
     * 
     * @return medelvärdet.
     */
    public double avgRoll() {
        double rollAvg = (double) rollSum / rollCount;
        return rollAvg;
    }

    /**
     * Printar ut statistik för tärning.
     */
    public void getStats() {
        System.out.printf(" sidiga tärningen tog det: %d slag. Medelvärdet för slagen: %.1f%n", rollCount, avgRoll());
    }
}

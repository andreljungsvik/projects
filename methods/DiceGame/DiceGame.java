package DiceGame;

public class DiceGame {
    public static void main(String[] args) {
        GameDie fourSided = new GameDie(6);
        // GameDie sixSided = new GameDie(6);
        // GameDie eightSided = new GameDie(8);
        // GameDie tenSided = new GameDie(10);
        // GameDie elevenSided = new GameDie(12);
        GameDie twentySided = new GameDie(20);

        fourSided.rollDice(100000);
        // sixSided.rollDice(100);
        // eightSided.rollDice(100);
        // tenSided.rollDice(100);
        // elevenSided.rollDice(100);
        twentySided.rollDice(100000);
    }
}

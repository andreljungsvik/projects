import java.util.*;

public class GuessingGame {
    private int guessCount;
    private int random;

    public GuessingGame() {
        Random rand = new Random();
        random = rand.nextInt(10) + 1;
        guessCount = 0;
    }

    public int guess(int number) {
        guessCount++;
        if (number > random) {
            return -1;
        } else if (number < random) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getGuessCount() {
        return guessCount;
    }
}

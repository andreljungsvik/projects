import java.util.*;

public class StartGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bestRun = 0;
        int worstRun = 0;
        boolean playAgain;

        do {
            GuessingGame game = new GuessingGame();
            int result;
            System.out.println("Gissa vilket tal jag tänker på?");

            do {
                int guess = input.nextInt();
                result = game.guess(guess);

                if (result == -1) {
                    System.out.println("Talet jag tänker på är mindre än " + guess);
                } else if (result == 1) {
                    System.out.println("Talet jag tänker på är större än " + guess);
                } else {
                    System.err.println("Hurra du lyckades");
                }

            } while (result != 0);

            int guessCount = game.getGuessCount();
            if (worstRun == 0) {
                bestRun = worstRun = guessCount;
            } else {
                bestRun = Math.min(bestRun, guessCount);
                worstRun = Math.max(worstRun, guessCount);
            }

            System.out.println("Som bäst har du lyckats på " + bestRun + " gissningar.");
            System.out.println("Som sämst har du lyckats på " + worstRun + " gissningar.");
            input.nextLine();
            System.out.println("Vill du spela igen? (J/N)");
            String yayOrNay = input.nextLine().trim();
            if (yayOrNay.equals("j")) {
                playAgain = true;
            } else {
                playAgain = false;
            }

        } while (playAgain);
        input.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Rps {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<String> rps = new ArrayList<>();
        rps.add("rock");
        rps.add("paper");
        rps.add("scissors");

        String input = "";

        int playerWins = 0;
        int computerWins = 0;

        while (!input.equals("stop")) {
            System.out.println("Whats your move? (rock/paper/scissors) \"stop\" to quit");
            input = scanner.nextLine().trim();

            if (input.equals("stop")) {
                break;
            }

            if (rps.contains(input)) {
                int randomIndex = rand.nextInt(rps.size());
                String randomMove = rps.get(randomIndex);

                System.out.println("Your move: " + input + ".");
                System.out.println("Opponents move: " + randomMove + ".");

                if (input.equals(randomMove)) {
                    System.out.println("Tie!");
                } else if (input.equals("paper") && randomMove.equals("rock") ||
                        (input.equals("scissors") && randomMove.equals("paper")) ||
                        (input.equals("rock") && randomMove.equals("scissors"))) {
                    System.out.println("You win!");
                    playerWins++;
                } else {
                    System.out.println("You lose!");
                    computerWins++;
                }
            } else {
                System.out.println("Invalid move! try again.");
            }
        }
        System.out.println("Player wins: " + playerWins + " Computer wins: " + computerWins);
    }
}

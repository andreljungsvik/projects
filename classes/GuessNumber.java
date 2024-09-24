import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void start() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(10) + 1;
        int guess = -1;

        System.out.println("Gissa vilket tal jag tänker på?");

        while (guess != random) {
            guess = input.nextInt();
            if (guess > random) {
                System.out.println("Talet är mindre än: " + guess);
                System.out.println("Försök igen: ");
            } else if (guess < random) {
                System.out.println("Talet är större än: " + guess);
                System.out.println("Försök igen: ");
            }
        }
        System.out.println("Grattis du gissade rätt. Talet var: " + random);

    }
}
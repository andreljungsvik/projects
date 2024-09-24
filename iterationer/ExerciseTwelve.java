import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ExerciseTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> rps = new ArrayList<String>();
        rps.add("sten");
        rps.add("sax");
        rps.add("pase");

        String input = "";
        int playerWins = 0;
        int computerWins = 0;

        while (!input.equals("sluta")) {
            System.out.println("Vilket är ditt drag? (sten/sax/pase/sluta)");
            input = scanner.nextLine().trim();

            if (input.equals("sluta")) {
                break;
            }

            if (rps.contains(input)) {
                int randomIndex = random.nextInt(rps.size());
                String randomMove = rps.get(randomIndex);

                System.out.print("Ditt drag: " + input + ".");
                System.out.println(" Motståndarens drag: " + randomMove + ".");

                if (input.equals(randomMove)) {
                    System.out.println("Det blev oavgjort.");
                } else if ((input.equals("sten") && randomMove.equals("sax")) ||
                        (input.equals("sax") && randomMove.equals("pase")) ||
                        (input.equals("pase") && randomMove.equals("sten"))) {
                    System.out.println("Du vinner!");
                    playerWins++;
                } else {
                    System.out.println("Du förlorar!");
                    computerWins++;
                }
            }
        }
        System.out.println("Du vann " + playerWins + " match(er), datorn vann " + computerWins + " match(er).");
        scanner.close();
    }
}

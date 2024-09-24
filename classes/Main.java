import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(
                "Vilket spel vill du spela? Sten sax påse (1) eller gissa nummret (2)? \nAnge 1 eller 2: (stop för att avsluta)");
        String game = input.nextLine();

        while (!game.equals("stop")) {

            if (game.equals("1")) {
                Rps.start();
            } else if (game.equals("2")) {
                GuessNumber.start();
            } else {
                System.out.println("Ogitligt svar.");
            }

            System.out.println("Vilket spel vill du spela? Sten sax påse (1) eller gissa nummret (2)? \nAnge 1 eller 2: (stop för att avsluta)");

            game = input.nextLine();
        }
        System.out.println("Tack för du spelade!");
    }
}
import java.util.*;

import intefacep.*;
import objects.*;
import players.*;

public class FantasticGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Andre");

        List<Interactive> items = List.of(new Horse(), new Rock(), new Mirror());

        while (true) {
            System.out.print("Du ser: ");
            for (Interactive item : items) {
                System.out.print(item.getName() + ", ");
            }
            System.out.println();
            System.out.println("Vad vill du använda? för att avsluta skriv: \"avsluta\"");
            String input = scanner.nextLine();

            if (input.toLowerCase().trim().equals("avsluta")) {
                System.out.println("Spelet avslutades. Ha en bra dag! Ses snart igen.");
                break;
            }

            for (Interactive item : items) {
                if (input.toLowerCase().trim().equals(item.getName())) {
                    item.interact(player);
                    break;
                }
            }
        }

    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("Vilket mynt vill du spara? ange 0 för att avsluta");
                try {
                    int coin = input.nextInt();
                    if (coin == 0) { // input 0 avslutar och visar mynt statistik
                        System.out.println("Du har sparat " + piggyBank.getCoinCount() + " till ett totalt värde av "
                                + piggyBank.getCoinSum() + " kr");
                        break;
                    }
                    piggyBank.addCoins(coin);
                } catch (InputMismatchException e) { // hanterar ogiltig inmatning
                    System.out.println("Ogiltig mynt! Spargrisen accepterar endast svenska mynt (1, 2, 5, 10).");
                    input.next(); // rensa felaktig inmatning
                }
            }

        }
    }
}
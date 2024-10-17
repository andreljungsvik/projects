import java.util.*;

// klass för att köra spargris programmet
public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        try (Scanner input = new Scanner(System.in)) {
            runPiggyBank(input, piggyBank);
        }
    }

    // metod för körning och utskrifter
    private static void runPiggyBank(Scanner input, PiggyBank piggyBank) {
        while (true) {
            System.out.println("Vilket mynt vill du spara? ange 0 för att avsluta");

            try {
                int coin = input.nextInt();

                if (coin == 0) { // input 0 avslutar och visar mynt statistik
                    System.out.println("Du har sparat " + piggyBank.getCoinCount() + " till ett totalt värde av "
                            + piggyBank.getCoinSum() + " kr");
                    break;
                }
                boolean isValidCoin = piggyBank.addCoins(coin); // kollar om myntet var giltigt eller ej

                if (!isValidCoin) { // ifall myntet var ogiltigt
                    System.out.println("Ogiltig mynt! Spargrisen accepterar endast svenska mynt (1, 2, 5, 10).");
                }
            } catch (InputMismatchException e) { // hanterar ogiltig inmatning
                System.out.println("Ogiltig mynt! Spargrisen accepterar endast svenska mynt (1, 2, 5, 10).");
                input.next(); // rensa felaktig inmatning
            }
        }
    }
}
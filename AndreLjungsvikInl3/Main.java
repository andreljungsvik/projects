import java.util.*;

public class Main {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        try (Scanner input = new Scanner(System.in)) { // stänger scanner när loopen är klar
            while (true) {
                System.out.println("Vilket mynt vill du spara? ange 0 för att avsluta");
                try {
                    int coin = input.nextInt();
                    if (coin == 0) { //0 avslutar programmet och visar antal mynt och totala summan
                        System.out.println("Du har sparat " + piggyBank.getCoinCount() + " till ett totalt värde av "
                                + piggyBank.getCoinSum() + " kr");
                        break;
                    }
                    piggyBank.addCoins(coin); //spara mynt metoden
                } catch (InputMismatchException e) { //ifall annat än siffra anges 
                    System.out.println("Endast svenska mynt tack: 1, 2, 5 eller 10!!!");
                    input.next();
                }
            }

        }
    }
}
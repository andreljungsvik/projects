import java.util.*;

public class Pets {
    private int petAmount;
    Scanner scanner = new Scanner(System.in);

    public Pets() {
        System.out.println("Hur många husdjur har du?");
        amountOfPets();
    }

    public void amountOfPets() {
        petAmount = scanner.nextInt();
        if (petAmount == 0) {
            System.out.println("Lugnt och skönt");
        } else if (petAmount >= 1 || petAmount <= 3) {
            System.out.println("Ganska vanligt");
        } else {
            System.out.println("Oj, det var rejält");
        }
    }

    public static void main(String[] args) {
        Pets hund = new Pets();
    }
}

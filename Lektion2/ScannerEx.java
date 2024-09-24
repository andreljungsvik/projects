import java.util.*;
import java.util.Random;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Gissa nummret 1-10: ");

        int number = rn.nextInt(10) + 1;
        int answer = -1;

        while (answer != number) {
            answer = scanner.nextInt();
            if (answer > number) {
                System.out.println("Numret var mindre än din gissning");
                System.out.println("Försök igen!");
            } else if(answer < number) {
                System.out.println("Numret var större än din gissning");
                System.out.println("Försök igen!");
            } else {
                System.out.println("Du gissade rätt! Svaret var: " + number);
            }
        }
        
    }
}

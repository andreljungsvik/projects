import java.util.Random;
import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = rand.nextInt(10) + 1;
        int input = -1;

        while(input != number) {
            System.out.print("Gissa vilket tal jag tänker på? ");
            input = scanner.nextInt();

            if (input < number) {
                System.out.println("Talet jag söker är större än " + input);
            } else if (input > number) {
                System.out.println("Talet jag söker är mindre än " + input);
            } else {
                System.out.println("Hurra du lyckades!");
                break;
            }
        }
        scanner.close();
    }
}

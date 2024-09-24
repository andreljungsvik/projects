import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange vilket år du föddes: ");
        int birthYear = scanner.nextInt();

        if (birthYear <= 2006) {
            System.out.println("Du är mydnig.");
        } else {
            System.out.println("Du är inte myndig.");
        }

    }
}

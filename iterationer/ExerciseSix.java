import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in startvärde för fakulteten: ");
        int faculty = scanner.nextInt();
        int result = 1;

        for(int i = 1; i <= faculty; i++ ) {
            result *= i;
        }

        System.out.println("Fakulteten för " + faculty + " är " + result);
        scanner.close();
    }
}


import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett tal: ");
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            System.out.println("Hej");
            System.out.println("Hej");
            System.out.println("Hej");
        }
        scanner.close();
    }
}

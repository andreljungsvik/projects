import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = -1;
        int sum = 0;

        while (input != 0) {
            System.out.print("Skriv in ett tal: ");
            input = scanner.nextInt();
            sum = input + sum;
        }
        System.out.println("Summan av de inmatade talen: " + sum);
        scanner.close();
    }
}

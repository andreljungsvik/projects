import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv in ett tal som får plats i en byte: ");
            int userInput = input.nextInt();
            byte number = -1;

            if (userInput > Byte.MAX_VALUE) {
                System.out.println("För stort, försök igen: ");
            } else if (userInput < Byte.MIN_VALUE) {
                System.out.println("För litet, försök igen: ");
            } else {
                number = (byte) userInput;
                System.out.println("Bra, du skrev: " + number);
                break;
            }
        }
        input.close();
    }
}

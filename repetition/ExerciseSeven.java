import java.util.*;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Skriv in ett tal: ");
            number = scanner.nextInt();
            if (number % 2 != 0) {
                break;
            } else {
                System.out.println("Skriv in ett udda tal, tack: ");
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (j == i) {
                    System.out.print("*");
                } else if (j + i == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("BAJJSSSS");
        }
    }
}

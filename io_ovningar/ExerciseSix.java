import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange ditt första heltal: ");
        int num1 = scanner.nextInt();

        System.out.println("Ange ditt andra heltal: ");
        int num2 = scanner.nextInt();

        int max;
        int min;

        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        scanner.nextLine();

        while (true) {
            System.out.println("Skriv \"max\" för att visa det största talet, \"min\" för att visa det minsta.");
            String answer = scanner.nextLine();

            switch (answer) {
                case "min":
                    System.out.println("Minsta talet: " + min);
                    return;
                case "max":
                    System.out.println("Största talet: " + max);
                    return;
                default:
                    System.out.println("svara på frågan noob");

            }
        }
    }
}

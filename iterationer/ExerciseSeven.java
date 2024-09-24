import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Skriv in höden i meter: ");
        double input = scanner.nextDouble();

        int bounces = 0;

        while(input > 0.01) {
            input *= 0.7;
            bounces ++;
        }
        System.out.println("Bollen studsar " + bounces + " gånger.");
        scanner.close();
    }
}

import java.util.*;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv in ett klockslag: ");
        String time = input.nextLine();

        int intHour = Integer.parseInt(time.substring(0, 2));
        int intMinutes = Integer.parseInt(time.substring(3, 5));
        String correctSymbol = time.substring(2, 3);

        if (correctSymbol.equals(":") && intHour <= 23 && intMinutes <= 59) {

            System.out.println("Det är ett korrekt klockslag!");
        } else {
            System.out.println("Det är INTE ett korrekt klockslag!");
        }

        input.close();
    }
}

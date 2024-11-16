
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;
import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your birthdate (yyyy-MM-dd)");
            LocalDate birthDate;
            LocalDate today = LocalDate.now();
            while (true) {
                String userBirth = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                birthDate = LocalDate.parse(userBirth, formatter);
                if (birthDate.isAfter(today)) {
                    System.out.println("You can not be before " + today);
                    System.out.println("Enter valid birthdate");
                    continue;
                }
                break;
            }

            long daysBetween = ChronoUnit.DAYS.between(birthDate, today);
            System.out.println("Du är " + daysBetween + " dagar gammal");
        }

    }
}

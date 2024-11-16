
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise4 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime newYear = LocalDateTime.of(2025, 01, 01 , 0, 0);

        Duration toNextYear = Duration.between(today, newYear);
        System.out.println(toNextYear.toDays());
    }
}

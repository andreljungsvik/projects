import java.time.*;
import java.time.chrono.*;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 10, 23);
        LocalDate inOneMonth = LocalDate.now().plusMonths(1);
        LocalTime gbg = LocalTime.now();
        LocalTime ny = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(date);
        System.out.println(inOneMonth);
        System.out.println(gbg);
        System.out.println(ny);
    }
}
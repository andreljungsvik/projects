import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class WarmUp {
    public static void main(String[] args) {
        // LLLL = month in long format, EEEE = day of week in long format
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLLL EEEE");
        final LocalDate currentDate = LocalDate.now();
        String defaultFormattedDate = currentDate.format(formatter);
        System.out.println("Default Locale: " + defaultFormattedDate);
        Locale frenchLocale = new Locale("fr", "FR");
        String frenchFormattedDate = currentDate.format(formatter.withLocale(frenchLocale));
        System.out.println("French Locale: " + frenchFormattedDate);
        Locale germanLocale = new Locale("de", "DE");
        String germanFormattedDate = currentDate.format(formatter.withLocale(germanLocale));
        System.out.println("German Locale: " + germanFormattedDate);
    }
}
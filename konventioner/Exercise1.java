import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("sv-SE");
    
        try (Scanner scanner = new Scanner(System.in).useLocale(locale)) {
            System.out.println("Input 3 decimal values: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();
            double avg = (num1 + num2 + num3) / 3;
            String gbAvg = String.format(locale, "%.3f", avg);
            System.out.println(gbAvg);
        }
    }
}

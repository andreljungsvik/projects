import java.text.*;
import java.util.Locale;

public class Exercise3 {
    public static void main(String[] args) {
        Locale se = Locale.forLanguageTag("sv-SE");
        DateFormatSymbols seSymbols = new DateFormatSymbols(se);

        Locale ch = Locale.forLanguageTag("de-CH");
        DateFormatSymbols chSymbols = new DateFormatSymbols(ch);
        
        for(String month : seSymbols.getMonths()) {
            System.out.println(month);
        }

        for(String month : chSymbols.getMonths()) {
            System.out.println(month);
        }
    }
}

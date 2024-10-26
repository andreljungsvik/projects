import java.util.Comparator;
import java.time.LocalDate;

public class BirthYearComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        LocalDate birthDate1 = o1.getBirthDate();
        LocalDate birthDate2 = o2.getBirthDate();
        return birthDate1.compareTo(birthDate2); // Jämför födelsedatum och returnera int
    }
}

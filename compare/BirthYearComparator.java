import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        Integer birthYear1 = o1.getBirthYear();
        Integer birthYear2 = o2.getBirthYear();
        return birthYear1.compareTo(birthYear2);
    }

}
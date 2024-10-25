import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Lars", "Eriksson", 1976);
        Person p2 = new Person("Magnus", "Andersson", 1996);
        Person p3 = new Person("Per", "Larsson", 1986);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        BirthYearComparator comp = new BirthYearComparator();

        Collections.sort(persons, comp);

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

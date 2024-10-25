import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Lars", "Eriksson", 1976);
        Person p2 = new Person("Magnus", "Andersson", 1996);
        Person p3 = new Person("Per", "Larsson", 1986);
        Person p4 = new Person(p1);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        // BirthYearComparator comp = new BirthYearComparator();

        // Collections.sort(persons, comp);

        // persons.sort(Comparator.comparing(Person::getBirthYear));

        // for (Person person : persons) {
        //     System.out.println(person);
        // }
        // System.out.println("kollar ifall de är lika med varann: " + (p1.equals(p4)));// förväntat resultat true
        // System.out.println("kollar ifall de har samma hashcode: " + (p1.hashCode() == p3.hashCode())); // förväntat
        //                                                                                                // resultat false
    
        System.out.println("p1: " + persons.get(0) + "\np2: " + persons.get(3));
        System.out.println("p1 och p4 är lika test: " + p1.equals(p4)); //förväntat resultat true
        System.out.println("p1 och p4 är olika objekt: " + (p1 != p4)); //förväntat resultat true
    }
}

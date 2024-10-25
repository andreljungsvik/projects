import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public int compareTo(Person o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthYear=" + birthYear + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person) obj;

        return Objects.equals(firstName, p.firstName)
                && Objects.equals(lastName, p.lastName)
                && Objects.equals(birthYear, p.birthYear);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result
                + Integer.hashCode(birthYear);
        return result;
    }

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.birthYear = other.birthYear;
    }
}

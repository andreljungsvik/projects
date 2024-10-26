import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Person o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "]";
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
                && Objects.equals(birthDate, p.birthDate);
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result
                + Objects.hashCode(birthDate);
        return result;
    }

    public Person(Person other) {
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.birthDate = other.birthDate;
    }
}

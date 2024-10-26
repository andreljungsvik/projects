import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class FileToList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ", 3);
                LocalDate birthDate = LocalDate.parse(parts[0]);
                String firstName = parts[1];
                String lastName = parts.length > 2 ? parts[2] : "";
                persons.add(new Person(firstName, lastName, birthDate));
            }
        } catch (IOException e) {
            System.out.println("Ingen fil hittades");
        }

        Collections.sort(persons, new BirthYearComparator());

        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = null;
        Person nextPerson = null;

        for (Person person : persons) {
            LocalDate birthDate = person.getBirthDate();
            LocalDate nextBD = LocalDate.of(today.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());

            if (nextBD.isBefore(today) || nextBD.isEqual(today)) {
                nextBD = nextBD.plusYears(1);
            }

            if (nextBirthday == null || nextBD.isBefore(nextBirthday)) {
                nextBirthday = nextBD;
                nextPerson = person;
            }
        }
        if (nextPerson != null) {
            long age = ChronoUnit.YEARS.between(nextPerson.getBirthDate(), nextBirthday);
            System.out.println(nextPerson.getFirstName() + " " + nextPerson.getLastName() +
                    " fyller år " + nextBirthday +
                    " och blir " + age + " år gammal.");
        } else {
            System.out.println("Ingen person i listan.");
        }
    }
}

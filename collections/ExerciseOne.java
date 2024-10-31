import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Collection<String> person = new HashSet<>();
        Random rand = new Random();

        System.out.println("skriv in tävlande: ");
        while (true) {
            String addPerson = scanner.nextLine();
            if (addPerson.isBlank()) {
                break;
            }
            person.add(addPerson);
        }
        List<String> list = new ArrayList<>(person);
        int winner = rand.nextInt(person.size());
        System.out.println("random numret var  " + winner);

        System.out.println("Vinnaren är: " + list.get(winner));
    }
}

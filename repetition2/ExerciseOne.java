import java.util.*;

public class ExerciseOne {
    public static String randomName() {
        List<String> firstNames = List.of("Nisse", "Bosse", "Lena", "Leyla");
        List<String> lastNames = List.of("Eriksson", "Smith", "Patel", "Rojas", "Lamm");

        Random rand = new Random();
        int random = rand.nextInt(4);

        StringBuilder fullName = new StringBuilder();

        fullName.append(firstNames.get(random) + " ");
        random = rand.nextInt(5);
        fullName.append(lastNames.get(random));

        String toString = fullName.toString();

        return toString;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(randomName());
        }
    }
}

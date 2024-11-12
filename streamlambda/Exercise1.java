import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<String> names = new ArrayList<>();
            while (true) {
                String input = scanner.nextLine();
                if (input.equals("")) {
                    break;
                }
                names.add(input);
            }

            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}

import java.util.*;
import java.util.stream.*;

public class Exercise2 {
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
            List<String> list2 = new ArrayList<>();
            list2 = names.stream()
                    .filter(s -> s.length() >= 2)
                    .map(String::trim)
                    .map(String::toLowerCase)
                    .filter(s -> {
                        char a = s.charAt(1);
                        return a != 'a';
                    })
                    .collect(Collectors.toList());

            for (String name : list2) {
                System.out.println(name);
            }
        }

    }
}

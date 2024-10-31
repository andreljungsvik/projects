import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<String> strings = new TreeSet<>();
            System.out.println("mata in namn");
            while (true) {
                String name = scanner.nextLine();
                if (name.isBlank()) {
                    break;
                }
                strings.add(name);
            }
            for(String name : strings) {
                System.out.println(name);
            }
        }
    }
}

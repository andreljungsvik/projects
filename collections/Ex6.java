import java.util.*;
import javax.xml.stream.events.Namespace;

public class Ex6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                list.add(number);
            }
        }

        ListIterator<Integer> reverse = list.listIterator(list.size());
        while (reverse.hasPrevious()) {
            int number = reverse.previous();
            System.out.println(number);
            if (reverse.hasPrevious()) {
                reverse.previous();
            }
        }
    }
}

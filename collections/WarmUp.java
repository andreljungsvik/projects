import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
        Collection<String> coll1 = new HashSet<>();
        Collection<String> coll2 = new ArrayList<>();
        for (String item : List.of("Hej", "Hej", "Monica", "Hej",
                "på", "dig", "Monica")) {
            coll1.add(item);
            coll2.add(item);
        }
        System.out.println(coll1);
        System.out.println(coll2);
    }
}
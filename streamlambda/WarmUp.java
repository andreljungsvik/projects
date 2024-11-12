import java.util.*;

public class WarmUp {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);
    }
}
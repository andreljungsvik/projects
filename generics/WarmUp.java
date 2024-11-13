import java.util.*;

public class WarmUp {
    public static <T extends Comparable<T>> Optional<T> findMax(T[] array) {
        if (array == null || array.length == 0) {
            return Optional.empty();
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return Optional.of(max);
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 5, 3, 9, 2 };
        String[] stringArray = { "Imagine", "all", "the", "people" };
        var maxInteger = findMax(intArray).orElseThrow();
        var maxString = findMax(stringArray).orElseThrow();
        System.out.println("Maximum Integer: " + maxInteger);
        System.out.println("Maximum String: " + maxString);
    }
}
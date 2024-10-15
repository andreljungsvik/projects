import java.util.*;

public final class MathUtils {
    public static int smallestPositive(List<Integer> numbers) {
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > 0 && number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static List<Integer> allNegative(List<Integer> numbers) {
        List<Integer> negative = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                negative.add(number);
            }
        }
        return negative;
    }

    // public static int numSum(List<Integer> numbers) {
    // int sum = 0;

    // for(int number : numbers) {

    // }

    // return sum;
    // }

    public static void main(String[] args) {
        List<Integer> bajs = new ArrayList<>();
        bajs.add(19);
        bajs.add(51);
        bajs.add(1239);
        bajs.add(12);
        bajs.add(6);

        // System.out.println(smallestPositive(bajs));
        System.out.println(allNegative(bajs));
    }
}

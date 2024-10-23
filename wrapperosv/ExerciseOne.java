import java.util.*;

public class ExerciseOne {
    public static int evenSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        @SuppressWarnings("Convert2Diamond")
        List<Integer> numbers = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            int random = rand.nextInt(500);
            numbers.add(random);
        }

        System.out.println(evenSum(numbers));
    }
}

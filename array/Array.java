import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ExerciseOne bajs = new ExerciseOne();

        System.out.println("Mata in 10 st heltal med Enter emellan: ");
        
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("Summan är " + bajs.sum(numbers));
    }
}

import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int input = scanner.nextInt();
            if (input > 10) {
                throw new IllegalArgumentException("Talet är större än 10.");
            } else if (input < 0) {
                throw new RuntimeException("Talet är mindre än 0");
            } else {
                System.out.println(input);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}

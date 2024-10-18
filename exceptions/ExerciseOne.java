import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input = scanner.nextInt();
            if (input > 10) {
                throw new IllegalArgumentException("aja baja din input var större än 10");
            } else if (input < 0) {
                throw new RuntimeException("aja baja din input var mindre än 0");
            } else {
                System.out.println("valid min broder: " + input);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}

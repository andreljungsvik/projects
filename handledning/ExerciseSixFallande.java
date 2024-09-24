public class ExerciseSixFallande {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1e10; i > 1; i--) {
            sum += i;
        }

        System.out.println(sum);

    }
}
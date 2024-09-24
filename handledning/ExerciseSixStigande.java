public class ExerciseSixStigande {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i < 1e10; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}

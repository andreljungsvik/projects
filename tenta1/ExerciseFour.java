public class ExerciseFour {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum += i;
            } else if (i == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

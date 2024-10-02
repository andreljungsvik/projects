public class OddSum {
    public static void main(String[] args) {

        int sum = 1;
        for (int i = 0; i <= 99; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

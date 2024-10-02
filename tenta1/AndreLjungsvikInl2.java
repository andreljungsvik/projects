public class AndreLjungsvikInl2 {
    public static long evenSum(int from, int to) {
        long sum = 0L;

        // retunerar -1 ifall from är större än to
        if (from > to) {
            return -1L;
        }

        // gör talet jämnt ifall ojämnt
        if (from % 2 != 0) {
            from++;
        }



        // summerar alla jämna tal från - to
        for (long i = from; i <= to; i += 2) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(evenSum(1, 7));
    }
}
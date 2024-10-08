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

        // gör talet jämnt ifall ojämnt
        if (to % 2 != 0) {
            to--;
        }

        // summerar alla jämna tal från - to
        for (long i = from; i <= to; i += 2) {
            sum += i;
        }

        return sum;
    }
}


import java.util.concurrent.ConcurrentLinkedQueue;

public class Exercise5 {
    private static boolean isPrime(long num) {
        for (long i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        int[] numberArray = queue.stream().mapToInt(Integer::intValue).toArray();
        Thread t1 = new Thread(() -> {
            for (int i = 3; i < 10000; i++) {
                if (isPrime(i)) {
                    queue.add(i);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i : numberArray) {

            }
        });
    }
}

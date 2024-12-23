
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

    private static boolean containsEight(int number) {
        while (number != 0) {
            if (number % 10 == 8) {
                return true;
            }

            number = number / 10;
        }
        return false;
    }

    private static final ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            for (int i = 3; i < 10000; i++) {
                if (isPrime(i)) {
                    queue.add(i);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                Integer i = queue.poll();
                if (i != null && containsEight(i)) {
                    System.out.println(i);
                }
            }

            while (true) {
                Integer i = queue.poll();
                if (i == null) {
                    break;
                } 
                else if (containsEight(i)) {
                    System.out.println(i);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();

        t2.interrupt();
        t2.join();
    }
}

public class Exercise1 {
    // private static class Interruptable implements Runnable {
    // public void run() {
    // while (!Thread.currentThread().isInterrupted()) {
    // System.out.println("Hello");
    // }
    // }
    // }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("Hello");
            }
        });
        t1.start();

        for (int i = 0; i <= 1000; i++) {
            System.out.println("World");
        }

        

        t1.interrupt();
        t1.join();

        System.out.println("Time to quit");
    }
}

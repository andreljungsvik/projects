public class WarmUp {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
            System.out.println("World");
            System.out.println("Hello");
            System.out.println("World");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Halloj");
            System.out.println("Klotet");
            System.out.println("Halloj");
            System.out.println("Klotet");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
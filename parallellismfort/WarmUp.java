import java.util.*;
import java.util.concurrent.*;

public class WarmUp {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for (String str : List.of("Hello", "very", "beutiful", "world")) {
            service.submit(() -> {
                System.err.println(str);
            });
        }
        service.shutdown();
        service.awaitTermination(5, TimeUnit.SECONDS);
    }
}
import java.util.*;
import java.util.concurrent.*;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (String str : List.of("j1", "j2", "j3", "j4", "j5")) {
            service.submit(() -> {
                for (int i = 0; i < 50; i++) {
                    System.out.println(str);
                }
            });
        }

        service.shutdown();
    }
}

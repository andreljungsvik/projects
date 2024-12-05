import java.io.*;
import java.nio.file.*;
import java.util.concurrent.*;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(() -> {
            for (String filePath : args) {
                try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {

                    String line;
                    while ((line = reader.readLine()) != null) {
                        int count = countA(line);
                        System.out.println(filePath + ": " + count + "st A");
                    }

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }

            }
        });
        service.shutdown();
    }

    private static int countA(String line) {
        int count = 0;
        for (char c : line.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}

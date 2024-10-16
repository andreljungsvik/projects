import java.io.*;
import java.nio.file.*;

public class WarmUp {
    public static void main(String[] args) throws IOException {
        for (String filename : args) {
            Path path = Path.of(filename);
            if (!Files.isReadable(path)) {
                continue;
            }
            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
    }
}

import java.io.*;
import java.nio.file.*;

public class ExerciseFive {
    public static void copy(Path from, Path to) throws IOException {
        try (InputStream input = Files.newInputStream(from);
                OutputStream output = Files.newOutputStream(to, StandardOpenOption.CREATE_NEW,
                        StandardOpenOption.WRITE)) {
            byte[] buffer = new byte[4096];
            while (true) {
                int size = input.read(buffer);
                if (size == -1) {
                    break;
                }

                output.write(buffer, 0, size);
            }
        }
    }
    public static void main(String[] args) {
        
    }
}

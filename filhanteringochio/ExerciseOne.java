
import java.io.*;
import java.nio.file.*;

public class ExerciseOne {
    public static void main(String[] args) throws IOException{
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("hello.txt"), StandardOpenOption.APPEND)) {
            writer.write("Hello World\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

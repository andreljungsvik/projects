import java.io.*;
import java.nio.file.*;

public class ReverseFile {
    public static void main(String[] args) {
        Path inputFilePath = Path.of(args[0]);
        try {
            long fileSize = Files.size(inputFilePath);
            final long MAX_SIZE_MB = 1 * 1024 * 1024;

            if (fileSize > MAX_SIZE_MB) {
                System.out.println("Filen får inte överstiga 1 MB");
                return;
            }
            try (
                    BufferedReader reader = Files.newBufferedReader(Path.of(args[0]));
                    BufferedWriter writer = Files.newBufferedWriter(Path.of("filen.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String reverse = new StringBuilder(line).reverse().toString();
                    writer.write(reverse);
                    writer.newLine();
                }

            }

        } catch (IOException e) {
            System.out.println("Filen hittades inte.");
            System.out.println(e.getMessage());
        }

    }
}

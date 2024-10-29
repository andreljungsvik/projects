
import com.sun.source.tree.WildcardTree;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.naming.spi.DirStateFactory;

public class ExerciseFour {
    public static void main(String[] args) {
        try {
            Path tempFile = Files.createTempFile("temp", ".txt");

            try (BufferedWriter writer = Files.newBufferedWriter(tempFile, StandardOpenOption.APPEND);
                    Scanner scanner = new Scanner(System.in)) {
                System.out.println("Mata in text (avsluta med return)");
                while (true) {
                    String input = scanner.nextLine();
                    if (input.isEmpty()) {
                        Path resultFile = Path.of("result.txt");
                        Files.move(tempFile, resultFile, StandardCopyOption.REPLACE_EXISTING);
                        break;
                    }
                    writer.append(input);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("Kunde inte skapa eller skriva till filen: " + e.getMessage());
        }

    }
}

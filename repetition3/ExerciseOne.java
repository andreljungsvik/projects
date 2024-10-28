import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Tjena mannen bror, vad vill du skriva till filen? ");
        try (
            Scanner scanner = new Scanner(System.in);
            BufferedWriter writer = Files.newBufferedWriter(Path.of("memorable_lines.txt"))
            ) {
                String input = scanner.nextLine();
                

        } catch (Exception e) {
        }

    }
}

import java.io.*;
import java.nio.file.*;
import java.util.*;
import jdk.dynalink.StandardOperation;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Tjena mannen bror, vad vill du skriva till filen? ");
        try (
                Scanner scanner = new Scanner(System.in);
                BufferedWriter writer = Files.newBufferedWriter(Path.of("memorable_lines.txt"),
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {

            String input = scanner.nextLine();
            writer.append(input);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Ett fel uppstod när filen skulle skrivas: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Ett oväntat fel inträffade: " + e.getMessage());
        }

    }
}

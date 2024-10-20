
import java.io.*;
import java.nio.file.*;

public class ExerciseThree {
    public static void main(String[] args) {
        Path filePath = Path.of("hello.txt");

        if (Files.exists(filePath) && Files.isReadable(filePath)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (FileNotFoundException e) {
                System.out.println("Fel inträffade, filen existerar inte.");
            } catch (IOException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}

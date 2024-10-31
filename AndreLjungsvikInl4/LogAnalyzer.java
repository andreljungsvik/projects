
import java.io.*;
import java.nio.file.*;

public class LogAnalyzer {
    public enum LogLevel {
        INFO,
        WARN,
        ERRO
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Input atleast one file to analyze.");
            return;
        }

        for (String filePath : args) {
            System.out.println("Analyzing file: " + filePath);
            try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {

                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
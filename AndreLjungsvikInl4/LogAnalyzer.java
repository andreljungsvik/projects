import java.io.*;
import java.nio.file.*;
import java.util.*;

public class LogAnalyzer {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Input atleast one file to analyze.");
            return;
        }

        Map<String, Integer> level = new HashMap<>();
        Map<String, Integer> message = new HashMap<>();
        int totalEntries = 0;

        for (String filePath : args) {
            try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    totalEntries++;
                    String[] parts = line.split(" ", 3);
                    String logLevel = parts[1];
                    String logMessage = parts[2];

                    level.merge(logLevel, 1, Integer::sum);
                    message.merge(logMessage, 1, Integer::sum);

                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Total entries: " + totalEntries + "\n");

        System.out.println("Log level distribution:");
        level.forEach((key, count) -> System.out.println(key + ": " + count));
        System.out.println();

        System.out.println("Top 3 most frequent log messages:");

    }
}
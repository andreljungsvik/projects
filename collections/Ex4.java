import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;

public class Ex4 {
    // your code here
    private static void createData(Path file) throws IOException {
        int lines = ThreadLocalRandom.current().nextInt(50) + 10000;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.toFile()))) {
            for (int i = 0; i < lines; ++i) {
                writer.append("hej\r\nhopp\r\n");
            }
        }
    }

    private static final Map<String, Integer> fileLines = new HashMap<>();

    private static int getNumberOfLines(String filename) throws IOException {
        Integer lines = fileLines.get(filename);
        if (lines != null) {
            return lines;
        }

        int lineCount = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }
        }
        fileLines.put(filename, lineCount);
        return lineCount;
    }

    public static void main(String[] args) throws IOException {
        Path[] tempFiles = new Path[3];
        for (int i = 0; i < tempFiles.length; ++i) {
            tempFiles[i] = Files.createTempFile("temp", ".txt");
            tempFiles[i].toFile().deleteOnExit();
            createData(tempFiles[i]);
        }
        System.out.println("Done creating data.");
        for (int i = 0; i < 1000; ++i) {
            String filename = tempFiles[i % 3].toString();
            int oldCount = getNumberOfLines(filename);
            if (oldCount != getNumberOfLines(filename)) {
                System.out.println("Oops, something went wrong!");
                System.exit(-1);
            }
        }
        System.out.println("Done!");
    }
}
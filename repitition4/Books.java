import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Books {
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("bocker.txt"))) {
            TreeMap<String, List<String>> treeMap = new TreeMap<>();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");

                String author = parts[0];
                String book = parts[1];

                if (treeMap.containsKey(author)) {
                    treeMap.get(author).add(book);
                } else {
                    List<String> books = new ArrayList<>();
                    books.add(book);
                    treeMap.put(author, books);
                }
            }
            for (Map.Entry<String, List<String>> entry : treeMap.entrySet()) {
                String author = entry.getKey();
                List<String> books = entry.getValue();
                Collections.sort(books);
                System.out.println(author + ":" + String.join(",", books));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

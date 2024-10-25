
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileToList {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                persons.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ingen fil hittades");
            e.printStackTrace();
        }
        for(String line : persons) {
            System.out.println(line);
        }
    }
    //split linen och använd comparable
    public class 
}

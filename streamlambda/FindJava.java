import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class FindJava {
    public static void main(String[] args) {
        try(Stream<Path> filesWalk = Files.walk(Paths.get(args[0]))){
            List<String> javaFiles = filesWalk.filter(Files::isRegularFile)
            .map(f -> f.toString())
            .filter(f -> f.endsWith(".java"))
            .collect(Collectors.toList());

            javaFiles.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

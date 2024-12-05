
import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream("utf8.txt"), "UTF-8"))) {
                writer.write("\u2661\u2665\u2661");
            }
    }
}

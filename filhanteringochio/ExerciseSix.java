import java.io.*;

public class ExerciseSix {
    public static void copyFile(String[] args) {
        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(args[0]));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(args[1]))) {

                byte[] data = new byte[4096];

                while (true) { 
                    int readSize = input.read(data, 0, data.length);
                    if (readSize == -1) {
                        break;
                    }

                    output.write(data, 0, readSize);
                }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        copyFile(args);
    }
}

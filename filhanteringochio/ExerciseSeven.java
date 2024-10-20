
import java.io.*;

public class ExerciseSeven {
    public static void fileCheck(String fileInput) {
        if (fileInput.endsWith(".class")) {
            System.out.println("Filen är inte en java class-fil");
            return;
        }

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileInput))) {
            byte[] fourChars = new byte[4];
            


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

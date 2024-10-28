
import java.io.IOException;

public class ExerciseTwo {
    public static int countSubStrings(String substring, String text) {
        if (substring == null || text == null) {
            throw new IllegalArgumentException("Inmatningen får inte vara tom");
        }
        if (substring.isEmpty() || text.length() < substring.length()) {
            throw new IllegalArgumentException("substring kan inte vara tom eller längre än text");
        }
        int index = 0;
        int count = 0;

        while ((index = text.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "jag heter lars vad heter du mannen. du kanske heter något coolt bror";
        String substring = "heter";
        System.out.println(countSubStrings(substring, text));
    }
}

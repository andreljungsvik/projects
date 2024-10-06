import java.util.*;

public class ExerciseThree {
    public static String mostOf(List<String> textlines, char ch) {
        String mostAmount = "";
        int charCounter = 0;

        for(String textline : textlines) {
            int tempCount = 0;
            for(int i = 0; i < textline.length(); i++) {
                char letter = textline.charAt(i);
                if (letter == ch) {
                    tempCount++;
                }
            }
            if (tempCount > charCounter) {
                charCounter = tempCount;
                mostAmount = textline;
            }
        }
        return mostAmount;
    }

    public static void main(String[] args) {
        List<String> textlines = new ArrayList<String>();
        textlines.add("Hoppsan.");
        textlines.add("Vem kommer hem klockan fem?");
        textlines.add("Hello everybody");

        System.out.println(mostOf(textlines, 's'));
    }
}
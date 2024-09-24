import java.util.*;

public class ExerciseFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Skriv en mening: ");
        String sentence = input.nextLine();

        System.out.println("Skriv en bokstav: ");
        String letter = input.nextLine();
        char charLetter = letter.charAt(0);
        
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (charLetter == sentence.charAt(i)) {
                count++;
            }
        }
        System.out.println("Din mening innehåller " + count + " stycken " + letter);
        input.close();
    }
}

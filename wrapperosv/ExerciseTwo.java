import java.util.*;

public class ExerciseTwo {
    public enum CharType {
        VOWEL, CONSONANT, OTHER
    }

    public static CharType checkCharType(char character) {
        if (!Character.isLetter(character)) {
            return CharType.OTHER;
        } else if ("aåeiouyäö".indexOf(Character.toLowerCase(character)) != -1) {
            return CharType.VOWEL;
        }
        return CharType.CONSONANT;
    }

    public static void printLetterCount(String text) {
        int vowels = 0;
        int consonants = 0;
        int others = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                continue;
            }
            CharType letter = checkCharType(currentChar);
            switch (letter) {
                case VOWEL:
                    vowels++;
                    break;
                case OTHER:
                    others++;
                    break;
                case CONSONANT:
                    consonants++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("Vowel count: %d%nConsonant count: %d%nOther count: %d%n", vowels, consonants, others);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Mata in 1 för tecktentyp eller 2 för räkna olika typer tecken i sträng:");
            String choice = input.nextLine();

            if (choice.trim().equals("1")) {
                System.out.println("Vänligen mata in tecknet: ");
                String charInput = input.next();
                char theChar = charInput.charAt(0);
                System.out.println(checkCharType(theChar));
            }
            if (choice.trim().equals("2")) {
                System.out.println("Vänligen mata in text strängen: ");
                String text = input.nextLine();
                printLetterCount(text);
            }
        }
    }
}

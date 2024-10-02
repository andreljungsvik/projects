import java.util.*;

public class Secret {

    public Secret(String choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice.trim().toLowerCase().equals("r")) {
            System.out.println("Ange text du vill konverta: ");
            String input = scanner.nextLine();
            String converted = TheRobberLanguage(input);
            System.out.println(converted);

        } else if (choice.trim().toLowerCase().equals("a")) {
            System.out.println("Ange text du vill konverta: ");
            String input = scanner.nextLine();
            String converted = TheAllLanguage(input);
            System.out.println(converted);
        }
    }

    public String TheRobberLanguage(String text) {
        String[] consonants = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v",
                "w", "x", "z" };
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String currentChar = String.valueOf(text.charAt(i));
            boolean ifConsonant = false;

            for (String consonant : consonants) {
                if (currentChar.equals(consonant)) {
                    ifConsonant = true;
                    break;
                }
            }

            if (ifConsonant) {
                builder.append(currentChar + "o" + currentChar);
            } else if (!ifConsonant) {
                builder.append(currentChar);
            }

        }
        String converted = builder.toString();
        return converted;
    }

    public String TheAllLanguage(String text) {
        String[] consonants = { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v",
                "w", "x", "z" };
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String currentChar = String.valueOf(text.charAt(i));
            boolean ifConsonant = false;

            for (String consonant : consonants) {
                if (currentChar.equals(consonant)) {
                    ifConsonant = true;
                    break;
                }
            }

            if (ifConsonant) {
                builder.append(currentChar + "all");
            } else if (!ifConsonant) {
                builder.append(currentChar);
            }

        }
        String converted = builder.toString();
        return converted;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rövar språket eller Allspråket? (R/A)");
        String choice = scanner.nextLine();
        new Secret(choice);

    }
}

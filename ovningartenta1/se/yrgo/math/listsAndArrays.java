import java.util.*;

public class listsAndArrays {

    public static void arrayWithStrings(String[] strings) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Mata in sträng " + (i + 1) + ":");
            strings[i] = scanner.nextLine();
        }
        System.out.println("");
        scanner.close();
    }

    public static void amountOfVocals(String[] strings) {
        char[] vocals = { 'a', 'e', 'i', 'o', 'u', 'å', 'ä', 'ö' };

        for (String string : strings) {
            string = string.toLowerCase();
            int vocalCount = 0;
            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i);

                for (char vocal : vocals) {
                    if (currentChar == vocal) {
                        vocalCount++;
                        break;
                    }
                }

            }
            System.out.println(string + ": " + vocalCount + " vokaler");
        }
    }

    public static void main(String[] args) {
        String[] strings = new String[10];

        arrayWithStrings(strings);
        Arrays.sort(strings);
        amountOfVocals(strings);
    }
}
import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in ett tal: ");
        int userInput = input.nextInt();

        int counter = 0;

        if (userInput > 0) {
            for (int i = 1; i <= userInput; i++) {
                String number = String.valueOf(i);
                char firstChar = number.charAt(0);
                if (firstChar == '1') {
                    counter++;
                }
            }
        } else {
            for (int i = -1; i >= userInput; i--) {
                String number = String.valueOf(i);
                char firstChar = number.charAt(1);
                if (firstChar == '1') {
                    counter++;
                }
            }
        }

        System.out.println("Mellan 1 och " + userInput + " finns det " + counter + " tal som börjar på en etta.");
        input.close();
    }
}

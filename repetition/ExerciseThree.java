import java.util.*;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Vad vill du äta?\n" + "1. Förrätt\n" + "2. Varmrätt\n" + "3. Fika");
            int foodChoice = input.nextInt();

            switch (foodChoice) {
                case 1:
                    System.out.println("Förrätt");
                    break;

                case 2:
                    System.out.println("Varmrätt");
                    break;

                case 3:
                    System.out.println("Fika");
                    break;

                default:
                    System.out.println("Ogiltligt val försök igen");
                    continue;
            }
            break;
        }
        input.close();
    }
}
